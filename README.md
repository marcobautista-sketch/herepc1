aqui voy a escribir todo:


UTEC desea centralizar la difusion y gestion de actividades academicas, culturales y deportiva. Se requiere desarrollar EventPassUtec, una API REST que permita administrar eventos tipos
de entrada e inscripciones de participantes:

//Entidades: User-CampusEvent-TickerType-EventRegistration

    //Controller-Service-Repository-DTOs-SpringData JPA-Validacion
    //manejo global de excepciones-transacciones-eventos y seguridad JWT

     //user:
    //id-username-email-password-role(attendee-organizer-admin

    //campusevent:
    //id-organizerld-tittle-description-category-eventDate-location-status

    //TickerType:
    //id-event-name-capacity-registeredCount-status

    //EventRegistration:
    //id-eventld-tyckertype-attendeeld-registeredAt-statuss-transacciones-eventos y seguridad JWT

     //user:
    //id-username-email-password-role(attendee-organizer-admin

    //campusevent:
    //id-organizerld-tittle-description-category-eventDate-location-status

    //TickerType:
    //id-event-name-capacity-registeredCount-status

    //EventRegistration:
    //id-eventld-tyckertype-attendeeld-registeredAt-statu
    

       //title:"Feria de Poryectos CS"
    //Description: "Presentacion de proyectos estudiantiles"
    //category:"TECHNOLOGY
    //eventDate: 2026-10-20T16:00:00-05:00
    //location: "Auditorio UTEC"


    //Response DTO
    //organizerUsername:
    //tittle:Feria de proyectos CS
    //Category: TECHNOLOGY
    //status:DRAFT
     //Campusevent (Academic-cultural-Sports-Technology)
    //campusevent - Status (draft,published,cancelled,finished
    //Pruebas minimas:
    //Prueba unitaria de RegistrationService para inscripcion exitosa, evento no publicado y entrada sin cupos
    //@DataJpaTest para verificar la busqueda de eventos futuros y la restriccion de inscripcion unica
    //prueba de integracion de flujo login, register, inscripccion utilizando JWT y PostgresSQL con testcontainers

    //Requisitos Transversales:
    //Usar DTOs de entrada y salida con Bean Validation; no exponer entidades JPA directamente.
    //Proteger operaciones privadas con JWT y aplicar autorizacion por rol y propiedad del evento.
    //Procesar la generacion de entradas y notificaciones mediante eventos AFTER_commit y listeners asincronicos