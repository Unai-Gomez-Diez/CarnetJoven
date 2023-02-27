package com.iesam.carnetjoven.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.carnetjoven.domain.models.Empresa;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpresaFileLocalDataSource {
    private static EmpresaFileLocalDataSource instance = null;

    private String nameFile = "empresas.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Empresa>>() {
    }.getType();

    private EmpresaFileLocalDataSource() {
    }

    public void save(Empresa model) {
        List<Empresa> models = findAll();
        models.add(model);
        saveToFile(models);
    }



    private void saveToFile(List<Empresa> models) {
        try {
            FileWriter myWriter = new FileWriter(nameFile);
            myWriter.write(gson.toJson(models));
            myWriter.close();
            System.out.println("Datos guardados correctamente");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al guardar la información.");
            e.printStackTrace();
        }
    }




    public List<Empresa> findAll() {
        try {
            File myObj = new File(nameFile);
            if (!myObj.exists()) {
                myObj.createNewFile();
            }
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                myReader.close();
                return gson.fromJson(data, typeList);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error al obtener el listado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al crear el fichero.");
            throw new RuntimeException(e);
        }
        return new ArrayList<>();
    }



    public static EmpresaFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new EmpresaFileLocalDataSource();
        }
        return instance;
    }
}
