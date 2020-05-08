package tiago.garcia.controller;

import tiago.garcia.repository.PlayerRepository;
import tiago.garcia.model.PlayerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/players")
public class PlayerControlle {
    @Autowired
    private PlayerRepository playerrepository;

    public ResponseEntity<List<PlayerEntity>> findAll(){
        return new ResponseEntity<List<PlayerEntity>>(
                (List<PlayerEntity>)this.playerrepository.findAll(),
                new HttpHeaders(), HttpStatus.OK);
    }
    @GetMapping(path = "(/{id}")

    public ResponseEntity<PlayerEntity> findById(@PathVariable ("id")long id) {
        if (this.playerrepository.findById(id).isPresent()) {
            return new ResponseEntity<PlayerEntity>(
                    this.playerrepository.findById(id).get(),
                    new HttpHeaders(),
                    HttpStatus.OK);
        }
        return new ResponseEntity<PlayerEntity>(HttpStatus.NOT_FOUND);
    }
    public ResponseEntity<PlayerEntity> cadastrar (@RequestBody PlayerEntity funcionarioEntity){
        return new ResponseEntity<PlayerEntity>(
                this.playerrepository.save(funcionarioEntity),
                new HttpHeaders(),
                HttpStatus.CREATED
        );
    }
    @PutMapping(value = "/id")
    public ResponseEntity<PlayerEntity> atualizar (@PathVariable("id")long id,
                                                        @RequestBody PlayerEntity funcionarioEntity)throws Exception{
        if(id== 0 || !this.playerrepository.existsById(id)){ //op. Lógicos
            throw new Exception("Código não encontrado ou inexistente");
        }
        return new ResponseEntity<PlayerEntity>(
                this.playerrepository.save(funcionarioEntity),
                new HttpHeaders(),
                HttpStatus.OK);

    }
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<PlayerEntity> deletar (@PathVariable("id") long id ){
        this.playerrepository.deleteById(id);
        return new ResponseEntity<PlayerEntity>(new HttpHeaders(), HttpStatus.OK);
    }
    }
