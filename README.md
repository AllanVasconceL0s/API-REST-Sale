<h1 align="center" style="font-weight: bold;"># 💻 API-REST-Sale #</h1>


<p align="center">
    <b>Sistema de monitoramento de vendas com exibição de gráficos interativos baseados em dados obtidos a partir de uma API-REST utilizando boas práticas e padrões de desenvolvimentos atuais. Aplicação Web Completa, utilizando Spring boot no backend e REACT no frontend para a construção de uma interface intuitíva, interativa & moderna.</b>
</p>

<h2 id="technologies">💻 Tecnologias (Technologies)</h2>
<p align="center">
  <a href="https://skillicons.dev">
    <img src="https://skillicons.dev/icons?i=git,github,js,d3,nodejs,react,ts,yarn,eclipse,java,maven,spring,postgres" />
  </a>
</p>

<p align="center">
- Git | GitHub - JavaScript - D3 - NodeJS - REACT - TypeScript - Yarn - JAVA - MAVEN - Spring - Postgres - Eclipse
</p>

<h2 id="started">🚀 Começando (Getting started)</h2>

Descrição de como usar o projeto local. (Describe how to run your project locally)

<h3i id="prerequisites">📎Pré-Requisitos (Prerequisites)</h3>

- [Maven](https://github.com/)
- [JAVA](https://github.com/)
- [SpringBoot](https://github.com/)
- [NodeJS](https://github.com/)
- [Yarn](https://github.com)
- [REACT](https://github.com/)
- [JavaScript](https://github.com/)

<h2 id="cloning">🌀 Clonando (Cloning)</h2>

1 - Clonando o repositório:
git clone https://github.com/AllanVasconceL0s/API-REST-SALE.git
cd dashboard-vendas-react 

<h2 id="terminal">💻 VSCode ou IntelliJ IDE(Instalando as Dependências)</h2>

2 - Instalando as Dependências
- npm install ou yarn install
- Selecione a Pasta API-REST-Sale

3 - Configurando as Variáveis de Ambiente:
- Crie um arquivo .env na raiz do projeto
echo "REACT_APP_API_URL=http://localhost:8080/api" > .env

4 - Executando o Projeto:
- npm start
- yarn start

5 - Acessando a Aplicação:
- http://localhost:3000


### Build para Produção

```bash
npm run build
# ou
yarn build
```

## 🔧 Estrutura do Projeto

```
src/
├── components/
│   ├── Dashboard/
│   │   ├── SalesDashboard.jsx
│   │   ├── Charts/
│   │   │   ├── BarChart.jsx
│   │   │   └── LineChart.jsx
│   │   └── Filters/
│   │       └── FilterPanel.jsx
│   ├── UI/
│   │   ├── Card.jsx
│   │   ├── Button.jsx
│   │   └── Input.jsx
│   └── Layout/
│       ├── Header.jsx
│       └── Layout.jsx
├── services/
│   ├── api.js
│   └── salesService.js
├── utils/
│   ├── dateUtils.js
│   └── formatters.js
├── hooks/
│   └── useSalesData.js
└── styles/
    └── globals.css
```

## 📡 Integração com API Spring Boot

### Endpoints Esperados

```javascript
// GET /api/vendas - Buscar todas as vendas
// POST /api/vendas/filtrar - Buscar vendas com filtros
// GET /api/vendas/estatisticas - Obter estatísticas resumidas
// GET /api/produtos - Listar produtos
// GET /api/categorias - Listar categorias
```

### Exemplo de Integração

```javascript
// services/salesService.js
import axios from 'axios';

const API_BASE_URL = process.env.REACT_APP_API_URL || 'http://localhost:8080/api';

const api = axios.create({
  baseURL: API_BASE_URL,
  headers: {
    'Content-Type': 'application/json',
  },
});

export const salesService = {
  // Buscar vendas com filtros
  getSalesWithFilters: (filters) => 
    api.post('/vendas/filtrar', filters),
  
  // Buscar estatísticas
  getStatistics: () => 
    api.get('/vendas/estatisticas'),
  
  // Exportar dados
  exportSales: (filters) => 
    api.post('/vendas/exportar', filters, { responseType: 'blob' }),
};
```

## 📊 Funcionalidades

### Gráficos Disponíveis

#### 1. Gráfico de Barras - Vendas por Produto
- **Objetivo**: Visualizar a quantidade de vendas por produto
- **Interatividade**: Hover para detalhes, tooltip com informações completas
- **Filtros**: Limitado aos top 10 produtos por quantidade

#### 2. Gráfico de Linhas - Evolução Temporal
- **Objetivo**: Mostrar a evolução das vendas ao longo do tempo
- **Métricas**: Quantidade de vendas e receita total
- **Interatividade**: Pontos clicáveis, zoom temporal

### Sistema de Filtros

- **Filtro por Data**: Seleção de período específico
- **Filtro por Produto**: Busca textual por nome do produto
- **Filtro por Categoria**: Dropdown com todas as categorias disponíveis
- **Reset de Filtros**: Botão para limpar todos os filtros aplicados

### Exportação de Dados

- **Formato CSV**: Exportação completa dos dados filtrados
- **Colunas**: Produto, Categoria, Quantidade, Valor Unitário, Data
- **Nome do Arquivo**: `vendas-export.csv`

## 🧪 Testes e Validação

### Testes Rápidos da Aplicação

#### 1. Teste de Interface
```bash
# Verificar se a aplicação carrega corretamente
npm start
# Acessar http://localhost:3000
# Verificar se todos os componentes são renderizados
```

#### 2. Teste de Filtros
1. Alterar as datas de início e fim
2. Digitar nome de produto na busca
3. Selecionar categoria no dropdown
4. Verificar se os gráficos são atualizados
5. Testar o botão "Limpar Filtros"

#### 3. Teste de Responsividade
```bash
# Testar em diferentes resoluções
# Desktop: >= 1024px
# Tablet: 768px - 1023px
# Mobile: < 768px
```

#### 4. Teste de Exportação
1. Aplicar filtros
2. Clicar no botão "Exportar"
3. Verificar se o arquivo CSV é baixado
4. Validar o conteúdo do arquivo

### Simulação da API

O projeto inclui dados mock para demonstração:

```javascript
// Estrutura de dados esperada da API
{
  id: 1,
  produto: "Nome do Produto",
  quantidade: 25,
  valor: 2500.00,
  data: "2024-01-15",
  categoria: "Categoria"
}
```

## 🔄 Versionamento Git

### Estrutura de Commits

```bash
# Exemplo de histórico de commits
git log --oneline
a1b2c3d feat: implementar dashboard principal com gráficos
d4e5f6g feat: adicionar sistema de filtros avançados
g7h8i9j feat: implementar exportação CSV
j0k1l2m style: aplicar design responsivo com Tailwind
m3n4o5p refactor: organizar componentes em estrutura modular
p6q7r8s docs: adicionar documentação completa
s9t0u1v fix: corrigir formatação de dados nos gráficos
```

### Branches Sugeridas

- `main`: Branch principal (produção)
- `develop`: Branch de desenvolvimento
- `feature/graficos`: Implementação dos gráficos
- `feature/filtros`: Sistema de filtros
- `feature/exportacao`: Funcionalidade de exportação
- `hotfix/bug-fixes`: Correções urgentes

## 🚀 Deploy e Produção

### Build de Produção

```bash
# Gerar build otimizado
npm run build

# Testar build localmente
npx serve -s build
```

### Variáveis de Ambiente

```bash
# .env.production
REACT_APP_API_URL=https://api.suaempresa.com/api
REACT_APP_ENVIRONMENT=production
REACT_APP_VERSION=1.0.0
```

### Deploy Sugerido

- **Netlify**: Para deploy automático via Git
- **Vercel**: Para aplicações React com otimizações
- **AWS S3 + CloudFront**: Para produção escalável
- **Docker**: Para containerização

```dockerfile
# Dockerfile exemplo
FROM node:16-alpine as build
WORKDIR /app
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build

FROM nginx:alpine
COPY --from=build /app/build /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
```

## 🎯 Melhorias Futuras

### Funcionalidades Planejadas

- [ ] Dashboard em tempo real com WebSockets
- [ ] Filtros salvos e compartilháveis
- [ ] Comparação de períodos
- [ ] Alertas e notificações
- [ ] Relatórios automatizados
- [ ] Integração com ferramentas BI

### Otimizações Técnicas

- [ ] Implementar React Query para cache
- [ ] Adicionar testes unitários (Jest/RTL)
- [ ] Implementar lazy loading dos componentes
- [ ] Otimizar performance dos gráficos
- [ ] Adicionar PWA capabilities


### Contato

- **Email**: [allanronaldmelo@gmail.com]
- **LinkedIn**: [www.linkedin.com/in/allan-ronald-628b597a]
- **GitHub**: [github.com/AllanVasconceL0s]

## 📄 Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

---

**Desenvolvido com ❤️ por [Allan Ronald]**

*Última atualização: Junho 2025*


# OBS:
Todos os Pré-Requisitos devem estar instalados antes da execução do projeto na IDE utilizada. 

