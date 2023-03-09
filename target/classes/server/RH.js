//Nova Api
const cors = require('cors')
const express = require('express')
const app = express()

app.use(cors())

app.get('/', (req, res) => {
  return res.json([
    { Title: 'Back End Developer', Seniority: 'Junior', Vacancies: '5', CP: 'BFSI',Status:'Open', Priority:'Urgent'},
    { Title: 'AWS manager', Seniority: 'Senior', Vacancies: '5', CP: 'Itaú Group',Status:'Open', Priority:'Urgent'},
    { Title: 'Back End Developer', Seniority: 'Junior', Vacancies: '5', CP: 'BFSI',Status:'Hold', Priority:'Urgent'},
    { Title: 'Back End Developer', Seniority: 'Senior', Vacancies: '5', CP: 'Bradesco',Status:'Open', Priority:'Urgent'},
    { Title: 'Back End Developer', Seniority: 'Junior', Vacancies: '5', CP: 'CIELO',Status:'Hold', Priority:'Urgent'},
    { Title: 'Back End Developer', Seniority: 'Pleno', Vacancies: '5', CP: 'Bradesco',Status:'Open', Priority:'Urgent'},
  ])
})

app.listen('4535')
// Title 	Seniority 	Vacancies 	CP 	Status 	Priority