package com.iesam.carnetjoven.data.local;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iesam.carnetjoven.domain.models.Promocion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PromocionFileLocalDataSource {
    private static PromocionFileLocalDataSource instance = null;

    private String nameFile = "promociones.txt";

    private Gson gson = new Gson();

    private final Type typeList = new TypeToken<ArrayList<Promocion>>() {
    }.getType();

    private PromocionFileLocalDataSource() {
    }

    public void save(Promocion model) {
        List<Promocion> models = findAll();
        models.add(model);
        saveToFile(models);
    }

    public void saveList(List<Promocion> models) {
        saveToFile(models);
    }

    private void saveToFile(List<Promocion> models) {
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




    public List<Promocion> findAll() {
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



    public static PromocionFileLocalDataSource getInstance() {
        if (instance == null) {
            instance = new PromocionFileLocalDataSource();
        }
        return instance;
    }
}
