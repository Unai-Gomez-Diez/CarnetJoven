import com.iesam.carnetjoven.data.UsuarioDataRepository;
import com.iesam.carnetjoven.data.local.UsuarioFileLocalDataSource;
import com.iesam.carnetjoven.domain.UsuarioRepository;
import com.iesam.carnetjoven.presentation.MenuView;

public class Main {
    public static void main(String[] args) {



        MenuView menuView = new MenuView();
        menuView.init();
    }
}