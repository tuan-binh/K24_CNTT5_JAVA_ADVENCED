package isp;

import java.util.List;

public interface BaseService {
    List<String> findAll();

    String addNew();

    String update();

    void delete();
}
