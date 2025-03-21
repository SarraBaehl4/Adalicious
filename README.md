# Adalicious
kata#5
## Consignes

- 4h de temps recommandé en restant minimaliste sur l’interface front-end
- Le kata peut être rendu jusqu’à 17h
- Stack libre

## 🎯 Objectifs pédagogiques

### Côté back-end

- Savoir créer un serveur web
- Savoir créer une API (CRUD)
- Savoir connecter sa base de données avec son serveur

### Côté front-end

- Savoir utiliser un framework et exploiter ses mécaniques (composants, states, props, etc.)

## 💎 Enoncé

On te missionne pour créer une application qui va aider le restaurant d’Adalicious 🥦 à gérer les commandes en temps réel.

### Front-end

Développe une interface avec deux vues.

La première vue (utilisateur.trice) :

- Permet d’afficher le menu avec des images (simple) et des descriptions
- Permet aux utilisateurs de choisir leur plat
- (BONUS) De voir l’état de leur commande en temps réel

Le seconde vue (cuisine) :

- Permet à la cuisine de recevoir les commandes dans l’ordre
- Permet à la cuisine de mettre à jour le statut de la commande (en préparation, prête)

L’objectif est de rester au plus simple pour cet exercice, voici un schéma conceptuel :

![adalicious_mockup.png](attachment:43a08a13-1751-463a-a3c3-d3ee33b4ae11:adalicious_mockup.png)

<aside>
☝

Tu as le droit de personnaliser l’interface mais n’oublie pas de bien gérer ton temps.

Nous faisons ici le choix simple de saisir uniquement un nom pour identifier la commande de l’utilisateur.trice. Il n’est pas demandé dans cet exercice de créer un système d’authentification.

</aside>

### Back-end

Développe un CRUD qui permet :

| Méthode | Route attendue | Description |
| --- | --- | --- |
| `GET` | `/menu` | Affiche le menu |
| `GET` | `/order` | Affiche toutes les commandes |
| `GET` | `/order/{id}` | Affiche une commande spécifique |
| `POST` | `/order` | Crée une commande |
| `PUT` | `/order/{id}` | Met à jour une commande |
| `DELETE` | `/order/{id}` | Supprime une commande |
- D’afficher le menu (vue utilisateur.trice)
- De créer une commande (vue utilisateur.trice)
- D’afficher une commande (vue cuisine)
- De mettre à jour le statut de la commande (vue cuisine)

Les commandes ainsi que leur statut doivent être gérer avec une base de données. Tu es libre de choisir entre le NoSQL et le relationnel.

### Annexe

Voici un exemple de menu simple :

```json
[
  {
    "plate": "Hello World Burger",
    "description": "Un cheeseburger classique (pain, steak, fromage, salade, sauce).",
    "image": "🍔"
  },
  {
    "plate": "404 Not Found Fries",
    "description": "Des frites maison avec une sauce mystère (choisie aléatoirement par le backend !).",
    "image": "🍟"
  },
  {
    "plate": "JSON Nuggets",
    "description": "Nuggets de poulet avec 3 sauces au choix (ketchup, mayo, barbecue).",
    "image": "🍗"
  },
  {
    "plate": "Git Pull Tacos",
    "description": "Un taco simple avec poulet, salade, fromage et sauce.",
    "image": "🌮"
  },
  {
    "plate": "Front-end Salad",
    "description": "Une salade légère avec tomates, feta et vinaigrette maison.",
    "image": "🥗"
  },
  {
    "plate": "Back-End Brownie",
    "description": "Un brownie moelleux au chocolat.",
    "image": "🍫"
  },
  {
    "plate": "Full Stack Menu",
    "description": "Un combo burger, frites et boisson.",
    "image": "🥗"
  }
]
```
