package com.forsale.app.datalayer.network.responses;

import com.forsale.app.datalayer.network.entities.AddonsRequested;
import com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody;
import java.util.List;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: NewListingResponse.kt */
/* loaded from: classes2.dex */
public final class NewListingResponse {
    public static final int $stable = 8;
    @c("addons_approved")
    private final List<String> addonsApproved;
    @c("addons_declined")
    private final List<AddonsRequested> addonsDeclined;
    @c(GetListingsBaseBody.ADV_ID)
    private final int advId;
    @c("is_draft")
    private final int isDraft;
    @c("payment_url")
    private final String paymentUrl;

    public NewListingResponse(int i11, int i12, List<String> addonsApproved, List<AddonsRequested> addonsDeclined, String paymentUrl) {
        o.i(addonsApproved, "addonsApproved");
        o.i(addonsDeclined, "addonsDeclined");
        o.i(paymentUrl, "paymentUrl");
        this.advId = i11;
        this.isDraft = i12;
        this.addonsApproved = addonsApproved;
        this.addonsDeclined = addonsDeclined;
        this.paymentUrl = paymentUrl;
    }

    public static /* synthetic */ NewListingResponse copy$default(NewListingResponse newListingResponse, int i11, int i12, List list, List list2, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = newListingResponse.advId;
        }
        if ((i13 & 2) != 0) {
            i12 = newListingResponse.isDraft;
        }
        int i14 = i12;
        List<String> list3 = list;
        if ((i13 & 4) != 0) {
            list3 = newListingResponse.addonsApproved;
        }
        List list4 = list3;
        List<AddonsRequested> list5 = list2;
        if ((i13 & 8) != 0) {
            list5 = newListingResponse.addonsDeclined;
        }
        List list6 = list5;
        if ((i13 & 16) != 0) {
            str = newListingResponse.paymentUrl;
        }
        return newListingResponse.copy(i11, i14, list4, list6, str);
    }

    public final int component1() {
        return this.advId;
    }

    public final int component2() {
        return this.isDraft;
    }

    public final List<String> component3() {
        return this.addonsApproved;
    }

    public final List<AddonsRequested> component4() {
        return this.addonsDeclined;
    }

    public final String component5() {
        return this.paymentUrl;
    }

    public final NewListingResponse copy(int i11, int i12, List<String> addonsApproved, List<AddonsRequested> addonsDeclined, String paymentUrl) {
        o.i(addonsApproved, "addonsApproved");
        o.i(addonsDeclined, "addonsDeclined");
        o.i(paymentUrl, "paymentUrl");
        return new NewListingResponse(i11, i12, addonsApproved, addonsDeclined, paymentUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewListingResponse)) {
            return false;
        }
        NewListingResponse newListingResponse = (NewListingResponse) obj;
        if (this.advId == newListingResponse.advId && this.isDraft == newListingResponse.isDraft && o.d(this.addonsApproved, newListingResponse.addonsApproved) && o.d(this.addonsDeclined, newListingResponse.addonsDeclined) && o.d(this.paymentUrl, newListingResponse.paymentUrl)) {
            return true;
        }
        return false;
    }

    public final List<String> getAddonsApproved() {
        return this.addonsApproved;
    }

    public final List<AddonsRequested> getAddonsDeclined() {
        return this.addonsDeclined;
    }

    public final int getAdvId() {
        return this.advId;
    }

    public final String getPaymentUrl() {
        return this.paymentUrl;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.advId) * 31) + Integer.hashCode(this.isDraft)) * 31) + this.addonsApproved.hashCode()) * 31) + this.addonsDeclined.hashCode()) * 31) + this.paymentUrl.hashCode();
    }

    public final int isDraft() {
        return this.isDraft;
    }

    public String toString() {
        int i11 = this.advId;
        int i12 = this.isDraft;
        List<String> list = this.addonsApproved;
        List<AddonsRequested> list2 = this.addonsDeclined;
        String str = this.paymentUrl;
        return "NewListingResponse(advId=" + i11 + ", isDraft=" + i12 + ", addonsApproved=" + list + ", addonsDeclined=" + list2 + ", paymentUrl=" + str + ")";
    }
}
