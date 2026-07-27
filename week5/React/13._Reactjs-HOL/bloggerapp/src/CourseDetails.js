import React from 'react';

function CourseDetails(props) {
  if (props.courses.length === 0) {
    return <p>No courses available</p>;
  }
  return (
    <div>
      {props.courses.map((course) => (
        <div key={course.id}>
          <h3>{course.cname}</h3>
          <h4>{course.date}</h4>
        </div>
      ))}
    </div>
  );
}

export default CourseDetails;