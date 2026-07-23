import React from 'react';
import './App.css';
import officeImg from './office.jpg';

function App() {
  const element = "Office Space";
  const sr = officeImg;
  const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space"/>;
  const ItemName = {Name:"DBS", Rent: 50000, Address:'Chennai'};

  let colors=[];
  if(ItemName.Rent<=60000)
  {
    colors.push('textRed');
  }
  else{
    colors.push('textGreen');
  }

  const officeList = [
    { Name: "DBS", Rent: 50000, Address: 'Chennai' },
    { Name: "XYZ Corp", Rent: 75000, Address: 'Bangalore' },
    { Name: "ABC Ltd", Rent: 45000, Address: 'Mumbai' }
  ];

  return (
    <div>
      <h1>{element} , at Affordable Range </h1>
      {jsxatt}
      <h1>Name: {ItemName.Name}</h1>
      <h3 className={colors[0]}> Rent: Rs. {ItemName.Rent}</h3>
      <h3> Address: {ItemName.Address}</h3>

      <hr/>
      <h2>More Office Spaces</h2>
      {officeList.map((office, index) => {
        let itemColor = office.Rent <= 60000 ? 'textRed' : 'textGreen';
        return (
          <div key={index}>
            <h1>Name: {office.Name}</h1>
            <h3 className={itemColor}> Rent: Rs. {office.Rent}</h3>
            <h3> Address: {office.Address}</h3>
          </div>
        );
      })}
    </div>
  );
}

export default App;