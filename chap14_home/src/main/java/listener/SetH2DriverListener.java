package listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class SetH2DriverListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce)  { 
		try {
			Class.forName("org.h2.Driver");
		} catch (ClassNotFoundException e) {
			throw new IllegalStateException("JDBCドライバをロードできません");
		}
    }

    public void contextDestroyed(ServletContextEvent sce)  { 

    }
	
}
