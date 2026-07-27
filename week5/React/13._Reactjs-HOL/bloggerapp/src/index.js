import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import { books, blogs, courses } from './data';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <App books={books} blogs={blogs} courses={courses} />
);