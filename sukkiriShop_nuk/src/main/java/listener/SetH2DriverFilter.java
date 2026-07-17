package listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class SetH2DriverFilter implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce)  { 
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException(
					"JDBCドライバーを読み込めませんでした");
		}
    }

    public void contextDestroyed(ServletContextEvent sce)  { 

    }
	
}
