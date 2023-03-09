//Nova Api
const cors = require('cors')
const express = require('express')
const app = express()

app.use(cors())

app.get('/', (req, res) => {
  return res.json([
    {
      Description: 'Essa descrição teste Api do Axios, teste ok.',
      Linkedin_URL: 'No data available',
      Work_Location: 'Londrina - Paraná',
      Work_Model: 'Híbrido',
      New_Position_or_replacement: 'Replacement',
      Priority: 'Urgent',
      Status: 'Open Positions',
      Skills: '.NET CORE',
      Owner: 'Adriana Fileto',
      Customer: 'Bradesco',
      Cluster: 'BFSI2',
      seniority_level_required: 'Trainee (O-1 EXP YEARS)',
      minimum_experience_in_years:  '-',
      Need_client_interview: 'none',
      Spanish: 'Back-End Developer',
      English: 'none',
      Cloud_Skill: 'Yes',
      CP:'BFSI',
      WON: '-',
    },
    {Name:'Luana Alves', 	Main_Skill:'.NET CORE', 	Spanish_Required:'Intermediary', 	English_Required:'Intermediary'},
    {Name:'Julia Bastos', 	Main_Skill:'.NET CORE', 	Spanish_Required:'Intermediary', 	English_Required:'Intermediary'},
    {Name:'Gabriel Camacho', 	Main_Skill:'.NET CORE', 	Spanish_Required:'Intermediary', 	English_Required:'Intermediary'},
    {Name:'Eliaquim Rodrigues', 	Main_Skill:'.NET CORE', 	Spanish_Required:'Intermediary', 	English_Required:'Intermediary'},
  ])
})

app.listen('4555');