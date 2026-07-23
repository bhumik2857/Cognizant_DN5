import React from 'react';

function ListofPlayers({ players }) {
  return(
    players.map((item)=>
    {
    return(
        <li>Mr. {item.name}<span> {item.score} </span></li>
    )})
  )
}

export default ListofPlayers;