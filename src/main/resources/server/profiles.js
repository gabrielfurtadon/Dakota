//Nova Api
const cors = require('cors')
const express = require('express')
const app = express()

app.use(cors())

app.get('/', (req, res) => {
    return res.json([
        {fullName: 'Felipe', seniority: 'Junior', mainSkill: 'Java', job: 'Back End Developer'},
        {fullName: 'Gabriel', seniority: 'Junior', mainSkill: 'Java', job: 'Back End Developer'},
        {fullName: 'Luana', seniority: 'Junior', mainSkill: 'Java', job: 'Back End Developer'},
        {fullName: 'Julia', seniority: 'Junior', mainSkill: 'Java', job: 'Back End Developer'},
        {fullName: 'Felipe', seniority: 'Junior', mainSkill: 'Java', job: 'Back End Developer'},
    ])
})

app.listen('4568')