package com.forsale.app.datalayer.network.requestsbodies;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: EditUserBody.kt */
/* loaded from: classes2.dex */
public final class EditUserBody {
    public static final int $stable = 0;
    @c("allow_follow")
    private final int allowFollow;
    @c("email")
    private final String email;
    @c("first_name")
    private final String firstName;

    public EditUserBody(String firstName, String email, int i11) {
        o.i(firstName, "firstName");
        o.i(email, "email");
        this.firstName = firstName;
        this.email = email;
        this.allowFollow = i11;
    }

    public static /* synthetic */ EditUserBody copy$default(EditUserBody editUserBody, String str, String str2, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = editUserBody.firstName;
        }
        if ((i12 & 2) != 0) {
            str2 = editUserBody.email;
        }
        if ((i12 & 4) != 0) {
            i11 = editUserBody.allowFollow;
        }
        return editUserBody.copy(str, str2, i11);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.email;
    }

    public final int component3() {
        return this.allowFollow;
    }

    public final EditUserBody copy(String firstName, String email, int i11) {
        o.i(firstName, "firstName");
        o.i(email, "email");
        return new EditUserBody(firstName, email, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EditUserBody)) {
            return false;
        }
        EditUserBody editUserBody = (EditUserBody) obj;
        if (o.d(this.firstName, editUserBody.firstName) && o.d(this.email, editUserBody.email) && this.allowFollow == editUserBody.allowFollow) {
            return true;
        }
        return false;
    }

    public final int getAllowFollow() {
        return this.allowFollow;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public int hashCode() {
        return (((this.firstName.hashCode() * 31) + this.email.hashCode()) * 31) + Integer.hashCode(this.allowFollow);
    }

    public String toString() {
        String str = this.firstName;
        String str2 = this.email;
        int i11 = this.allowFollow;
        return "EditUserBody(firstName=" + str + ", email=" + str2 + ", allowFollow=" + i11 + ")";
    }
}
