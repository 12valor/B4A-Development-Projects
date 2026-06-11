# Recipe Manager App

Simple B4A CRUD project for the COMP332A end-term requirement.

## Features

- Add recipes with name, ingredients, and instructions.
- View saved recipes in a list.
- Tap a recipe to edit it.
- Update selected recipe.
- Delete selected recipe.
- SQLite database stored in `File.DirInternal/recipes.db`.

## How to open

1. Open B4A.
2. Open `RecipeManager.b4a`.
3. Make sure these libraries are checked: `Core`, `XUI`, and `SQL`.
4. Run or compile the app.

The included `Files/layout.bal` is loaded by the app so B4A recognizes the project layout requirement. The active interface is then created in `Main` code to keep the app easy to run and modify.
