package isp;

import java.util.List;

public class ProductService implements ProductBase {
    @Override
    public List<String> findAll() {
        return List.of();
    }

    @Override
    public String addNew() {
        return "";
    }

    @Override
    public String update() {
        return "";
    }

    @Override
    public void delete() {

    }

    @Override
    public List<String> pagination() {
        return List.of();
    }
}
