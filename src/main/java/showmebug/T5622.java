package showmebug;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class T5622 {
    private List<Data<?>> dataList = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void addData(Data data) {
        dataList.add(new Data<>(data));
    }

    public List searchData(Object keyword) {
        List<Data<?>> collect = dataList.stream().filter(data -> {
            if (data.value instanceof String && keyword instanceof String) {
                return ((String) data.value).contains((String) keyword);
            } else if (data.value instanceof Integer && keyword instanceof Integer) {
                return (data.value).equals(keyword);
            }
            return false;
        }).collect(Collectors.toList());
        return collect;
    }
}

class Data<T> {
    T value;

    Data(T value) {
        this.value = value;
    }
}