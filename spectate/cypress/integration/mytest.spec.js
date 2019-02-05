describe('mytest spec', function() {
  it('should  display greeting from service', function() {
    cy.visit('localhost:4200');
    cy.get('p').should('contain', 'REST Greeting Hello, Bee!')
  });
});
