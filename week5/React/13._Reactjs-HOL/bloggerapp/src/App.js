import React from 'react';
import './App.css';
import BlogDetails from './BlogDetails';
import CourseDetails from './CourseDetails';

function App(props) {
  const bookdet = (
    <ul>
      {props.books.map((book) =>
        <div key={book.id}>
        <h3>  {book.bname}</h3>
         <h4>{book.price}</h4>
        </div>
      )}
    </ul>
  );

  const content = <BlogDetails blogs={props.blogs} />;
  const coursedet = <CourseDetails courses={props.courses} />;

  return (
    <div>
    <div className="row">
    <div className="st2">
      <h1> Book Details</h1>
      {bookdet}
      </div>
      <div className="v1">
      <h1> Blog Details</h1>
      {content}
      </div>
      <div className="mystyle1">
        <h1> Course Details</h1>
      {coursedet}
    </div>
    </div>
    </div>
  );
}

export default App;