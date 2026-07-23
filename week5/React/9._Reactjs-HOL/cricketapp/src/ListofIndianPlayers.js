import React from 'react';

function ListofIndianPlayers({ IndianPlayers }) {
  return(
    IndianPlayers.map((item)=>
    {
      return(
          <li>Mr. {item}</li>
      )
    })
  )
}

export default ListofIndianPlayers;