package canal.cristhianodev.records;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/records", produces = MediaType.APPLICATION_JSON_VALUE)
public class RecordsAPI {
    @Autowired
    private RecordsService recordsService;

    @PostMapping
    @ResponseBody
    public RecordsDTO criar(@RequestBody RecordsDTO recordsDTO) {
        return recordsService.criar(recordsDTO);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public RecordsDTO atualizar(@PathVariable("id") Long id,
                                @RequestBody RecordsDTO recordsDTO) {
        return recordsService.atualizar(recordsDTO, id);
    }

    @GetMapping
    @ResponseBody
    public List<RecordsDTO> getAll() {
        return recordsService.getAll();
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public String deletar(@PathVariable("id") Long id) {
        return recordsService.delete(id);
    }
}
