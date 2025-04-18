package pzks.edu.anetrebin.kcos.item;

import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ItemService {
    private final ItemRepository repository;

    private List<Item> items;

    @PostConstruct
    void init() {
        repository.deleteAll();
        items.add(new Item("Wheel", "Item for car"));
        items.add(new Item("Keyboard", "Item for computer"));
        items.add(new Item("3", "Microwave", "Item for kitchen"));
        repository.saveAll(items);
    }

    public List<Item> getAll() {
        return repository.findAll();
    }

    public Item getById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

    public Item create(Item item) {

        return repository.save(item);
    }

    public Item update(Item item) {
        return repository.save(item);
    }
}
