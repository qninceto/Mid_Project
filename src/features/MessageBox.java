package features;

import java.time.LocalDate;
import java.util.*;

import model.POJO.User;

public class MessageBox {
private Collection<Message> messages;//composition!
private User interlocutor;//sybesednik
private User me;//leader of the conversation:me
private HostingStatusOfPost messageBoxType;
private final LocalDate chatCreationDate;
}
