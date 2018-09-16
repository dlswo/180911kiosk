package org.injae.listener;

import org.injae.domain.MenuVO;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@WebListener
public class MenuLoader implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {   //웹어플레케이션이 로딩되자마자 하는것.(전체에다 공유를 함)

        List<MenuVO> menuVOList = new ArrayList<>();
        Map<Integer,MenuVO> menuVOMap = new HashMap<>();

        for(int i = 0; i < 10; i++){
            MenuVO vo = new MenuVO(i,"메뉴"+i,i*1000);
            menuVOList.add(vo);
            menuVOMap.put(i,vo);

        }//end for

        sce.getServletContext().setAttribute("menuList",menuVOList);
        sce.getServletContext().setAttribute("menuMap",menuVOMap);
    }//end method
}
