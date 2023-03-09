//Nova Api
const cors = require('cors')
const express = require('express')
const app = express()

app.use(cors())

app.get('/', (req, res) => {
    return res.json([
        {profile_file_id: '01',
            full_name:'Julia Bastos Camacho', 
            share_with_cust_date:'20/06/2022 - 15h',
            location:'Londrina - Paraná',
            email:'juliabastoscontato@gmail.com',
            phone:'+55 (43) 999604543',
            resolution_comments:' Boa comunicação, trabalho em equipe, respeito pela diversidade.Experiência 2 anos como Junior em back-end.Curso superior Analise e Desenvolvimento de Sistemas completo.',
            candidate_screening_resolution:' Boa comunicação, trabalho em equipe, respeito pela diversidade. Experiência 2 anos como Junior em back-end.Curso superior Analise e Desenvolvimento de Sistemas completo.',
            feedback:'APPROVED - In Hiring Process',
            skill:'.NET CORE',
            salary_intention:'3.000,00',
            seniority:'Jr (1-2 EXP. Years)',
            spanish:'Intermediary',
            english:'Intermediary',
            profile_source:'none',
            name_role:'Back-End Developer',
            current_employer:'none',

        },
    ])
})

app.listen('4565')

