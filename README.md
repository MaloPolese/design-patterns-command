## Design-patterns - Command

1. Complete the TODOs in :

- `Command.java`
- `CommandHistory.java`
- `Editor.java`

2. Add 3 commands :

- `BlueCommand.java` ( Change editor background to bleu )
- `RedCommand.java` ( Change editor background to red )
- `YellowCommand.java` ( Change editor background to yellow )

`RedCommand` / `YellowCommand` create a backup in the history but not `BlueCommand`

2. Execute the application

```bash
java -D -cp bin App
```

![Result](docs/assets/result.png)
