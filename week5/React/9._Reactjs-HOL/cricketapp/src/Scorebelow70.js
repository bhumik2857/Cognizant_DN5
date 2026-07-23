import React from 'react';

function Scorebelow70({ players }) {
  let players70 = [];

  return(
    players.map((item)=>
    {
     if(item.score<=70)
      {
         players70.push(item);
      }
    }),
    players70.map((item)=>
    {
      return(
          <li>Mr. {item.name}<span> {item.score} </span></li>
      )
    })
  )
}

export default Scorebelow70;