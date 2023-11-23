# Microservice Product

### Endpoints

#### Save Product

````
POST /api/product HTTP/1.1
Host: localhost:3333
Content-Type: application/json
Authorization: Basic base64(username:password)
Content-Length: 42

{
    "name": "test-2",
    "price": 1.5
}
````

#### List Products

````
GET /api/product HTTP/1.1
Host: localhost:3333
Content-Type: application/json
Authorization: Basic base64(username:password)
Content-Length: 42

{
    "name": "test-2",
    "price": 1.5
}
````

#### Delete Product

````
DELETE /api/product/2 HTTP/1.1
Host: localhost:3333
Content-Type: application/json
Authorization: Basic Basic base64(username:password)
Content-Length: 42

{
    "name": "test-2",
    "price": 1.5
}
````