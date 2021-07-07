#language: pt
#encoding: utf-8

Funcionalidade: Teste no menu motorcycle do site da tricentis sample app com todos os dados corretos

Cenário: Preenchimento de todos os dados no submenu enter vehicle data

Dado que estou na inicial do site da tricentis
Quando acesso o menu Motorcycle
E seleciono Make e Model
E preencho CylinderCapacity, enginePerformance, DateOfManufacture
E seleciono NumberOfSeats 
E preencho ListPrice, AnnualMillage no primeiro submenu enter vehicle data
Então devo clicar em Next ao final do formulário e validar se mudei para a página enter insurant data

