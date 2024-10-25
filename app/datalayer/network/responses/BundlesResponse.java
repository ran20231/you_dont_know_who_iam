package com.forsale.app.datalayer.network.responses;

import a00.a;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: BundlesResponse.kt */
/* loaded from: classes2.dex */
public final class BundlesResponse implements Parcelable {
    @c("bundles")
    private final List<Bundle> bundles;
    public static final Parcelable.Creator<BundlesResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: BundlesResponse.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<BundlesResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BundlesResponse createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(Bundle.CREATOR.createFromParcel(parcel));
            }
            return new BundlesResponse(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BundlesResponse[] newArray(int i11) {
            return new BundlesResponse[i11];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BundlesResponse.kt */
    /* loaded from: classes2.dex */
    public static final class NextStep {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ NextStep[] $VALUES;
        private final String value;
        @c("check_out_page")
        public static final NextStep CheckoutPage = new NextStep("CheckoutPage", 0, "check_out_page");
        @c("addons_page")
        public static final NextStep AddonsPage = new NextStep("AddonsPage", 1, "addons_page");
        @c("")
        public static final NextStep DEFAULT = new NextStep("DEFAULT", 2, "");

        private static final /* synthetic */ NextStep[] $values() {
            return new NextStep[]{CheckoutPage, AddonsPage, DEFAULT};
        }

        static {
            NextStep[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private NextStep(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a<NextStep> getEntries() {
            return $ENTRIES;
        }

        public static NextStep valueOf(String str) {
            return (NextStep) Enum.valueOf(NextStep.class, str);
        }

        public static NextStep[] values() {
            return (NextStep[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    public BundlesResponse(List<Bundle> bundles) {
        o.i(bundles, "bundles");
        this.bundles = bundles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BundlesResponse copy$default(BundlesResponse bundlesResponse, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = bundlesResponse.bundles;
        }
        return bundlesResponse.copy(list);
    }

    public final List<Bundle> component1() {
        return this.bundles;
    }

    public final BundlesResponse copy(List<Bundle> bundles) {
        o.i(bundles, "bundles");
        return new BundlesResponse(bundles);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof BundlesResponse) && o.d(this.bundles, ((BundlesResponse) obj).bundles)) {
            return true;
        }
        return false;
    }

    public final List<Bundle> getBundles() {
        return this.bundles;
    }

    public int hashCode() {
        return this.bundles.hashCode();
    }

    public String toString() {
        List<Bundle> list = this.bundles;
        return "BundlesResponse(bundles=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        List<Bundle> list = this.bundles;
        out.writeInt(list.size());
        for (Bundle bundle : list) {
            bundle.writeToParcel(out, i11);
        }
    }
}
