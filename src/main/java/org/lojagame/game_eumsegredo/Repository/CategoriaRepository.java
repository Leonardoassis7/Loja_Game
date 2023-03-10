package org.lojagame.game_eumsegredo.Repository;

import java.util.List;

import org.lojagame.game_eumsegredo.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List <Categoria> findAllByCategoriaProdutoContainingIgnoreCase(@Param("categoriaProduto") String categoriaProduto);

}
