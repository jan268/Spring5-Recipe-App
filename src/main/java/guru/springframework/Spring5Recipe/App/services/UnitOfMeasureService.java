package guru.springframework.Spring5Recipe.App.services;

import guru.springframework.Spring5Recipe.App.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
