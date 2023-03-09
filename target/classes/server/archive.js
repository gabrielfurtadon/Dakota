//Nova Api
const cors = require('cors')
const express = require('express')
const app = express()

app.use(cors())

app.get('/', (req, res) => {
    return res.json([
        {
            id_open_position: '01',
            title: 'Titulo Vaga',
            customer: 'Bradesco',
            cluster: 'BFSI2',
            main_skill: '.NET CORE',
            status: 'filed'

        },
        {
            id_open_position: '02',
            title:'Titulo Vaga',
            customer: 'Bradesco',
            cluster: 'BFSI2',
            main_skill: '.NET CORE',
            status: 'filed'

        },
        {
            id_open_position: '03',
            title:'Titulo Vaga',
            customer: 'Bradesco',
            cluster: 'BFSI2',
            name_main_skill: '.NET CORE',
            status: 'filed'

        },
        {
            id_open_position: '04',
            title:'Titulo Vaga',
            customer: 'Bradesco',
            cluster: 'BFSI2',
            main_skill: '.NET CORE',
            status: 'done'

        },
        {
            id_open_position: '05',
            title:'Titulo Vaga',
            customer: 'Bradesco',
            cluster: 'BFSI2',
            main_skill: '.NET CORE',
            status: 'filed'

        },
        {
            id_open_position: '06',
            title:'Titulo Vaga',
            customer: 'Bradesco',
            cluster: 'BFSI2',
            main_skill: '.NET CORE',
            status: 'filed'

        },
        {
            id_open_position: '07',
            title:'Titulo Vaga',
            customer: 'Bradesco',
            cluster: 'BFSI2',
            main_skill: '.NET CORE',
            status: 'done'

        },
        {
            id_open_position: '08',
            title:'Titulo Vaga',
            customer: 'Bradesco',
            cluster: 'BFSI2',
            main_skill: '.NET CORE',
            status: 'done'

        },
        {
            id_open_position: '09',
            title:'Titulo Vaga',
            customer: 'Bradesco',
            cluster: 'BFSI2',
            main_skill: '.NET CORE',
            status: 'done'

        },
    ])
})

app.listen('4565')