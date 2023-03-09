//Nova Api
const cors = require('cors')
const express = require('express')
const app = express()

app.use(cors())

app.get('/', (req, res) => {
    return res.json([
        {
            profile_file_id: '01',
            full_name: 'Julinha Bastos',
            seniority: 'Pleno',
            skill: 'Java'

        },
        {
            profile_file_id: '01',
            full_name: 'Julinha Bastos',
            seniority: 'Pleno',
            skill: 'Java'

        },
        {
            profile_file_id: '01',
                full_name: 'Julinha Bastos',
            seniority: 'Pleno',
            skill: 'Java'

        },
        {
            profile_file_id: '01',
                full_name: 'Julinha Bastos',
            seniority: 'Pleno',
            skill: 'Java'

        },
        {
            profile_file_id: '01',
                full_name: 'Julinha Bastos',
            seniority: 'Pleno',
            skill: 'Java'

        },
        {
            profile_file_id: '01',
                full_name: 'Julinha Bastos',
            seniority: 'Pleno',
            skill: 'Java'

        },
        {
            profile_file_id: '01',
                full_name: 'Julinha Bastos',
            seniority: 'Pleno',
            skill: 'Java'

        },
        {
            profile_file_id: '01',
                full_name: 'Julinha Bastos',
            seniority: 'Pleno',
            skill: 'Java'

        },
    ])
})

app.listen('4566')