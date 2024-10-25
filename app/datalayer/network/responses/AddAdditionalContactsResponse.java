package com.forsale.app.datalayer.network.responses;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: AddAdditionalContactsResponse.kt */
/* loaded from: classes2.dex */
public final class AddAdditionalContactsResponse {
    public static final int $stable = 0;
    @c("contact_no")
    private final String ContactNo;

    public AddAdditionalContactsResponse(String ContactNo) {
        o.i(ContactNo, "ContactNo");
        this.ContactNo = ContactNo;
    }

    public static /* synthetic */ AddAdditionalContactsResponse copy$default(AddAdditionalContactsResponse addAdditionalContactsResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = addAdditionalContactsResponse.ContactNo;
        }
        return addAdditionalContactsResponse.copy(str);
    }

    public final String component1() {
        return this.ContactNo;
    }

    public final AddAdditionalContactsResponse copy(String ContactNo) {
        o.i(ContactNo, "ContactNo");
        return new AddAdditionalContactsResponse(ContactNo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AddAdditionalContactsResponse) && o.d(this.ContactNo, ((AddAdditionalContactsResponse) obj).ContactNo)) {
            return true;
        }
        return false;
    }

    public final String getContactNo() {
        return this.ContactNo;
    }

    public int hashCode() {
        return this.ContactNo.hashCode();
    }

    public String toString() {
        String str = this.ContactNo;
        return "AddAdditionalContactsResponse(ContactNo=" + str + ")";
    }
}
