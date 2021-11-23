package pl.rafal.pizza.remote.rest.dto.response;

import java.util.List;

public class PizzaDto {

    private Integer id;
    private String name;
    private List<SizeDto> size;

    public PizzaDto(Integer id, String name, List<SizeDto> size) {
        this.id = id;
        this.name = name;
        this.size = size;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SizeDto> getSize() {
        return size;
    }

    public void setSize(List<SizeDto> size) {
        this.size = size;
    }
}
