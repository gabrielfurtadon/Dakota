//Nova Api
const cors = require('cors')
const express = require('express')
const app = express()

app.use(cors())

app.get('/', (req, res) => {
    return res.json([
        {titulo: 'Felipe' ,permission: {
            id:1, 
            name:'hr'
        }},
        {name: 'Gabriel' ,permission: {
            id:1, 
            name:'hr manager'
        }},
        {name: 'Teste1' ,permission: {
            id:1, 
            name:'hr manager'
        }},
        {name: 'Thiago' ,permission: {
            id:1, 
            name:'hr'
        }},
        {name: 'Thiago' ,permission: {
            id:1, 
            name:'hr'
        }},
    ])
})

app.listen('4567')