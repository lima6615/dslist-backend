package com.projeto.dslist.entities;

import com.projeto.dslist.entities.pk.BelongingPK;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	private Integer position;

	public Belonging() {
	}

	public Belonging(Game game, GameList gameList, Integer position) {
		id.setGame(game);
		id.setGameList(gameList);
		this.position = position;
	}

	public Game getGame() {
		return id.getGame();
	}

	public void setGame(Game game) {
		id.setGame(game);
	}

	public GameList getGameList() {
		return id.getGameList();
	}

	public void setGameList(GameList gameList) {
		id.setGameList(gameList);;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}
}
