//Nova Api
const cors = require('cors')
const express = require('express')
const app = express()

app.use(cors())

app.get('/', (req, res) => {
    return res.json(
        [
            { name_main_skill: '.NET' },
            { name_main_skill: 'Java' },
            { name_main_skill: 'JavaScript' },
        ],
        [
            { owner: 'Adriana Fileto' },
            { owner: 'Alexander Sarda' },
            { owner: 'Aline Storck' },
            { owner: 'Ana Paula Richter' },
        ]
    )
})

app.listen('4569')
