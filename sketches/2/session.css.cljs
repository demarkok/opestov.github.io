(ns o8v.game)

(defonce style
  (let [h (.item (js/document.getElementsByTagName "head") 0)
        s (js/document.createElement "style")]
    (.appendChild h s)
    s))

(set! (.-innerHTML style)
"
html {font-size: 62.5%;}
body {
  margin: 0;
  padding: 0;
  font: normal 2rem / 1.5 Helvetica, Arial, sans-serif;
  text-rendering: optimizeLegibility;
  background-color: #f5f5f5;
  color: #222;
}
input { margin: 0; padding: 0;}

h1 { margin: 0 0 2rem 0; font-size: 3rem;}
h2 { margin: 1rem 0 1rem 0; font-size: 2.4rem;}


p {
  margin: 1rem 0 0 0;
  word-wrap: break-word;
}

.hatapp {
  width: 100%;
  max-width: 400px;
  margin: 0 auto;
  padding: 1rem 2rem;
  box-sizing: border-box;
}

button {
  display: block;
  padding: 0.5rem 1rem;
  margin: 1rem 0;
  width: 100%;
  background-color: #dadada;
  color: inherit;
	font-size: inherit;
	border: 3px dotted white;
	box-sizing: border-box;
  font-family: inherit;
  font-weight: inherit;
  text-align: left;
}

button:hover  {
  color: black;
	border: 3px solid white;
}

.go {
  font-weight: 600;
  font-size: 6rem;
}

.back {
  color: crimson;
  margin: 0 1rem 0 0;
  text-decoration: none;

}

.textbox {
	margin: 0.5rem 0 0 0;
  width: 100%;
  color: inherit;
	font-size: inherit;
	font-family: inherit;
	font-weight: inherit;
	padding: 0.5rem;
	border: 1px solid #999;
	box-sizing: border-box;
}

select {
  margin: 0;
  padding: 0.5rem 0.25rem;
  display: block;
  color: inherit;
	font-size: inherit;
	font-family: inherit;
	font-weight: inherit;
  width: 100%; 
	box-sizing: border-box;
}

.p5s-ul { list-style: none; margin: 0; padding: 0; }
.p5s-li {
  position: relative;
  padding: 0.5rem 7rem 0.5rem 0;
  margin: 0;
  border-top: 1px solid #ddd;
}
.p5s-li:last-child { border-bottom: 1px solid #ddd; }
.p5s-t { word-wrap: break-word;}
.p5s-up, .p5s-del {
  position: absolute;
  margin: auto 0;
  font-size: 1rem;
  width: 3rem;
  height: 3rem;
  top: 0;
  bottom: 0;
  border: none;
  text-align: center;
}
.p5s-up:hover, .p5s-del:hover { border: none; color: crimson; }
.p5s-up {right: 3.5rem;}
.p5s-del {right: 0rem;}

.l2t-h {text-align: right;}
.l2t-h span {text-align:center; width: 3rem; border: none; display:inline-block;}

.l2t-ul { list-style: none; margin: 0; padding: 0; }
.l2t-li {
  position: relative;
  padding: 0.5rem 9rem 0.5rem 0;
  margin: 0;
  border-top: 1px solid #ddd;
}
.l2t-li:last-child { border-bottom: 1px solid #ddd; }
.l2t-t { word-wrap: break-word; }
.l2t-d {
  position:absolute;
  font-size: inherit;
  right: 0; top: 0; bottom: 0;
  padding: 0;
  margin: auto 0;
  height: 3rem;
}
.l2t-i { width: 3rem; height: 3rem; }

.word {
  background-color: crimson;
  color: white;
  text-align: center;
  padding: 0;
  border: none;
}
.word:hover  {
  border: none;
  background-color: crimson;
  color: white;
}

.progress {
  background-color: black;
  height: 1rem;
}

table { border-collapse: collapse; table-layout: fixed; width: 100%; }
td {word-wrap: break-word; border: 1px solid black; padding: 0.5rem; text-align: center;}
.s7s-n { text-align: left; width: 60%; }
.s7s-b {margin-top: 4rem;  }
")
