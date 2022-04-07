const notes = require("./notes");
const http = require("http");


// const app = http.createServer((request, response) => {
//     logger(request, response, function() {
//         response.writeHead(200, { 'Content-Type': 'text/plain' })
//         response.end('Hello World')
//     })
// })

// const PORT = 3001
// app.listen(PORT)
// console.log(`Server running on port ${PORT}`)

// const requestLogger = (request, response, next) => {
// 	console.log("Method:", request.method);
// 	console.log("Path:  ", request.path);
// 	console.log("Body:  ", request.body);
// 	console.log("---");
// 	next();
// };

// EXPRESS Tutorial

const express = require("express");
const morgan = require("morgan");
const app = express();

// app.use(express.json());
app.use(morgan("tiny"));

app.get("/", (request, response) => {
	response.send("<h1>Hello World!</h1>");
});

app.get("/api/notes", (request, response) => {
    // logger(response);
	response.json(notes);
});

app.get("/api/notes/:id", (request, response) => {
	const id = Number(request.params.id);
	const note = notes.find((note) => {
		console.log(note.id, typeof note.id, id, typeof id, note.id === id);
		return note.id === id;
	});
	if (note) {
		response.json(note);
	} else {
		response.status(404).end();
	}
});

const generateId = () => {
	const maxId = notes.length > 0 ? Math.max(...notes.map((n) => n.id)) : 0;
	return maxId + 1;
};

app.post("/api/notes", (request, response) => {
	const body = request.body;

	if (!body.content) {
		return response.status(400).json({
			error: "content missing",
		});
	}

	const note = {
		content: body.content,
		important: body.important || false,
		date: new Date(),
		id: generateId(),
	};

	notes = notes.concat(note);

	response.json(note);
});

app.delete("/api/notes/:id", (request, response) => {
	const id = Number(request.params.id);
	notes = notes.filter((note) => note.id !== id);

	response.status(204).end();
});

const PORT = 3002;
app.listen(PORT, () => {
	console.log(`Server running on port ${PORT}`);
});
