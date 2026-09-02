#### Task 1.1

**Method          Path**   

POST  https://docs.github.com/api/events

**Headers**

Accept: */*

Accept-Language: en-US,en;q=0.9

**Body**

```json
 [{"type":"page","context":{"event_id":"020c6588-4baa-49ac-9954-8cb2d832e240","user":"15b24d66-6da5-4c11-9dd5-e31a1be4d692","version":"1.0.0","created":"2026-08-26T03:37:59.185Z","referrer":"","title":"REST API endpoints for variables - GitHub Docs","href":"https://docs.github.com/en/rest/agents/variables?apiVersion=2026-03-10","hostname":"docs.github.com","path":"/en/rest/agents/variables","search":"?apiVersion=2026-03-10"}]
```

**Task 1.2**

[https://api.restcountries.com/countries/v5](https://api.restcountries.com/countries/v5)

```http
GET /countries/v5      Responds with the list of all countries

GET /countries/v5/borders/’country’             Responds with the specific country’s borders

GET /countries/v5/capitals/Tokyo     Responds with the country with the specific capital
```

