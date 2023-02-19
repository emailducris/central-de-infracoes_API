package canal.cristhianodev.records;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecordsService {
    @Autowired
    private RecordsRepository repository;

    public RecordsDTO criar(RecordsDTO recordsDTO) {
        Records records = new Records();
        records.setDt_hora(records.getDt_hora());
        records.setVelocidade(records.getVelocidade());
        records.setPlaca(records.getPlaca());
        records.setClasse_veiculo(records.getClasse_veiculo());
        repository.save(records);
        recordsDTO.setId(records.getId());
        return recordsDTO;
    }

    public RecordsDTO atualizar (RecordsDTO recordsDTO, Long id) {
        Records recordsDatabase = repository.getOne(id);
        recordsDTO.setDt_hora(recordsDTO.getDt_hora());
        recordsDTO.setVelocidade(recordsDTO.getVelocidade());
        recordsDTO.setPlaca(recordsDTO.getPlaca());
        recordsDTO.setClasse_veiculo(recordsDTO.getClasse_veiculo());
        repository.save(recordsDatabase);
        return recordsDTO;
    }

    private RecordsDTO converter (Records records) {
        RecordsDTO result = new RecordsDTO();
        result.setId(records.getId());
        result.setDt_hora(records.getDt_hora());
        result.setVelocidade(records.getVelocidade());
        result.setPlaca(records.getPlaca());
        result.setClasse_veiculo(records.getClasse_veiculo());
        return result;
    }

    public List<RecordsDTO> getAll () {
        return repository
                .findAll()
                .stream()
                .map(this::converter).collect(Collectors.toList());
    }

    public String delete (Long id) {
        repository.deleteById(id);
        return "DELETED";
    }
}
