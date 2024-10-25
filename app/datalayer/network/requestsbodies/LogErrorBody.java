package com.forsale.app.datalayer.network.requestsbodies;

import com.leanplum.internal.Constants;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: LogErrorBody.kt */
/* loaded from: classes2.dex */
public final class LogErrorBody {
    public static final int $stable = 0;
    @c(Constants.Params.MESSAGE)
    private final String Message;
    @c("subject")
    private final String Subject;

    public LogErrorBody(String Subject, String Message) {
        o.i(Subject, "Subject");
        o.i(Message, "Message");
        this.Subject = Subject;
        this.Message = Message;
    }

    public final String getMessage() {
        return this.Message;
    }

    public final String getSubject() {
        return this.Subject;
    }
}
