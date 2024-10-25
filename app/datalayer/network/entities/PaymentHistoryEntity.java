package com.forsale.app.datalayer.network.entities;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: PaymentHistoryEntity.kt */
/* loaded from: classes2.dex */
public final class PaymentHistoryEntity implements Parcelable {
    @c("page_number")
    private final Integer pageNumber;
    @c("records")
    private final List<PaymentRecord> records;
    @c("total_pages")
    private final Integer totalPages;
    @c("total_records")
    private final Integer totalRecords;
    public static final Parcelable.Creator<PaymentHistoryEntity> CREATOR = new Creator();
    public static final int $stable = 8;

    /* compiled from: PaymentHistoryEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<PaymentHistoryEntity> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentHistoryEntity createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            o.i(parcel, "parcel");
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(PaymentRecord.CREATOR.createFromParcel(parcel));
                }
            }
            return new PaymentHistoryEntity(valueOf, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentHistoryEntity[] newArray(int i11) {
            return new PaymentHistoryEntity[i11];
        }
    }

    /* compiled from: PaymentHistoryEntity.kt */
    /* loaded from: classes2.dex */
    public static final class PaymentRecord implements Parcelable {
        public static final String AGENT_NAME = "agent_name";
        public static final String AMOUNT = "amount";
        public static final String CURRENCY = "currency";
        public static final String DESCRIPTION = "description";
        public static final String NUM_OF_ADS = "num_of_ads";
        public static final String PAYMENT_OPTION_NAME = "payment_option_name";
        public static final String POINTS = "points";
        public static final String REFERENCE_ID = "reference_id";
        public static final String TRANSACTION_DATE = "transaction_date";
        @c(AGENT_NAME)
        private final String agentName;
        @c(AMOUNT)
        private final String amount;
        @c(CURRENCY)
        private final String currency;
        @c("description")
        private final String description;
        @c(NUM_OF_ADS)
        private final String numOfAds;
        @c(PAYMENT_OPTION_NAME)
        private final String paymentOptionName;
        @c("points")
        private final int points;
        @c(REFERENCE_ID)
        private final String referenceId;
        @c(TRANSACTION_DATE)
        private final String transactionDate;
        public static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<PaymentRecord> CREATOR = new Creator();
        public static final int $stable = 8;

        /* compiled from: PaymentHistoryEntity.kt */
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* compiled from: PaymentHistoryEntity.kt */
        /* loaded from: classes2.dex */
        public static final class Creator implements Parcelable.Creator<PaymentRecord> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentRecord createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new PaymentRecord(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final PaymentRecord[] newArray(int i11) {
                return new PaymentRecord[i11];
            }
        }

        public PaymentRecord(String referenceId, String str, String str2, String str3, String str4, String str5, int i11, String str6, String str7) {
            o.i(referenceId, "referenceId");
            this.referenceId = referenceId;
            this.amount = str;
            this.currency = str2;
            this.description = str3;
            this.numOfAds = str4;
            this.paymentOptionName = str5;
            this.points = i11;
            this.transactionDate = str6;
            this.agentName = str7;
        }

        public static /* synthetic */ PaymentRecord copy$default(PaymentRecord paymentRecord, String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, String str8, int i12, Object obj) {
            String str9;
            String str10;
            String str11;
            String str12;
            String str13;
            String str14;
            int i13;
            String str15;
            String str16;
            if ((i12 & 1) != 0) {
                str9 = paymentRecord.referenceId;
            } else {
                str9 = str;
            }
            if ((i12 & 2) != 0) {
                str10 = paymentRecord.amount;
            } else {
                str10 = str2;
            }
            if ((i12 & 4) != 0) {
                str11 = paymentRecord.currency;
            } else {
                str11 = str3;
            }
            if ((i12 & 8) != 0) {
                str12 = paymentRecord.description;
            } else {
                str12 = str4;
            }
            if ((i12 & 16) != 0) {
                str13 = paymentRecord.numOfAds;
            } else {
                str13 = str5;
            }
            if ((i12 & 32) != 0) {
                str14 = paymentRecord.paymentOptionName;
            } else {
                str14 = str6;
            }
            if ((i12 & 64) != 0) {
                i13 = paymentRecord.points;
            } else {
                i13 = i11;
            }
            if ((i12 & 128) != 0) {
                str15 = paymentRecord.transactionDate;
            } else {
                str15 = str7;
            }
            if ((i12 & 256) != 0) {
                str16 = paymentRecord.agentName;
            } else {
                str16 = str8;
            }
            return paymentRecord.copy(str9, str10, str11, str12, str13, str14, i13, str15, str16);
        }

        public final String component1() {
            return this.referenceId;
        }

        public final String component2() {
            return this.amount;
        }

        public final String component3() {
            return this.currency;
        }

        public final String component4() {
            return this.description;
        }

        public final String component5() {
            return this.numOfAds;
        }

        public final String component6() {
            return this.paymentOptionName;
        }

        public final int component7() {
            return this.points;
        }

        public final String component8() {
            return this.transactionDate;
        }

        public final String component9() {
            return this.agentName;
        }

        public final PaymentRecord copy(String referenceId, String str, String str2, String str3, String str4, String str5, int i11, String str6, String str7) {
            o.i(referenceId, "referenceId");
            return new PaymentRecord(referenceId, str, str2, str3, str4, str5, i11, str6, str7);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentRecord)) {
                return false;
            }
            PaymentRecord paymentRecord = (PaymentRecord) obj;
            if (o.d(this.referenceId, paymentRecord.referenceId) && o.d(this.amount, paymentRecord.amount) && o.d(this.currency, paymentRecord.currency) && o.d(this.description, paymentRecord.description) && o.d(this.numOfAds, paymentRecord.numOfAds) && o.d(this.paymentOptionName, paymentRecord.paymentOptionName) && this.points == paymentRecord.points && o.d(this.transactionDate, paymentRecord.transactionDate) && o.d(this.agentName, paymentRecord.agentName)) {
                return true;
            }
            return false;
        }

        public final String getAgentName() {
            return this.agentName;
        }

        public final String getAmount() {
            return this.amount;
        }

        public final String getCurrency() {
            return this.currency;
        }

        public final String getDescription() {
            return this.description;
        }

        public final String getNumOfAds() {
            return this.numOfAds;
        }

        public final String getPaymentOptionName() {
            return this.paymentOptionName;
        }

        public final int getPoints() {
            return this.points;
        }

        public final String getReferenceId() {
            return this.referenceId;
        }

        public final String getTransactionDate() {
            return this.transactionDate;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7 = this.referenceId.hashCode() * 31;
            String str = this.amount;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (hashCode7 + hashCode) * 31;
            String str2 = this.currency;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str3 = this.description;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            String str4 = this.numOfAds;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            String str5 = this.paymentOptionName;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int hashCode8 = (((i15 + hashCode5) * 31) + Integer.hashCode(this.points)) * 31;
            String str6 = this.transactionDate;
            if (str6 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str6.hashCode();
            }
            int i16 = (hashCode8 + hashCode6) * 31;
            String str7 = this.agentName;
            if (str7 != null) {
                i11 = str7.hashCode();
            }
            return i16 + i11;
        }

        public String toString() {
            String str = this.referenceId;
            String str2 = this.amount;
            String str3 = this.currency;
            String str4 = this.description;
            String str5 = this.numOfAds;
            String str6 = this.paymentOptionName;
            int i11 = this.points;
            String str7 = this.transactionDate;
            String str8 = this.agentName;
            return "PaymentRecord(referenceId=" + str + ", amount=" + str2 + ", currency=" + str3 + ", description=" + str4 + ", numOfAds=" + str5 + ", paymentOptionName=" + str6 + ", points=" + i11 + ", transactionDate=" + str7 + ", agentName=" + str8 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.referenceId);
            out.writeString(this.amount);
            out.writeString(this.currency);
            out.writeString(this.description);
            out.writeString(this.numOfAds);
            out.writeString(this.paymentOptionName);
            out.writeInt(this.points);
            out.writeString(this.transactionDate);
            out.writeString(this.agentName);
        }
    }

    public PaymentHistoryEntity(Integer num, List<PaymentRecord> list, Integer num2, Integer num3) {
        this.pageNumber = num;
        this.records = list;
        this.totalPages = num2;
        this.totalRecords = num3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentHistoryEntity copy$default(PaymentHistoryEntity paymentHistoryEntity, Integer num, List list, Integer num2, Integer num3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = paymentHistoryEntity.pageNumber;
        }
        if ((i11 & 2) != 0) {
            list = paymentHistoryEntity.records;
        }
        if ((i11 & 4) != 0) {
            num2 = paymentHistoryEntity.totalPages;
        }
        if ((i11 & 8) != 0) {
            num3 = paymentHistoryEntity.totalRecords;
        }
        return paymentHistoryEntity.copy(num, list, num2, num3);
    }

    public final Integer component1() {
        return this.pageNumber;
    }

    public final List<PaymentRecord> component2() {
        return this.records;
    }

    public final Integer component3() {
        return this.totalPages;
    }

    public final Integer component4() {
        return this.totalRecords;
    }

    public final PaymentHistoryEntity copy(Integer num, List<PaymentRecord> list, Integer num2, Integer num3) {
        return new PaymentHistoryEntity(num, list, num2, num3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentHistoryEntity)) {
            return false;
        }
        PaymentHistoryEntity paymentHistoryEntity = (PaymentHistoryEntity) obj;
        if (o.d(this.pageNumber, paymentHistoryEntity.pageNumber) && o.d(this.records, paymentHistoryEntity.records) && o.d(this.totalPages, paymentHistoryEntity.totalPages) && o.d(this.totalRecords, paymentHistoryEntity.totalRecords)) {
            return true;
        }
        return false;
    }

    public final Integer getPageNumber() {
        return this.pageNumber;
    }

    public final List<PaymentRecord> getRecords() {
        return this.records;
    }

    public final Integer getTotalPages() {
        return this.totalPages;
    }

    public final Integer getTotalRecords() {
        return this.totalRecords;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Integer num = this.pageNumber;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        List<PaymentRecord> list = this.records;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        Integer num2 = this.totalPages;
        if (num2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num2.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Integer num3 = this.totalRecords;
        if (num3 != null) {
            i11 = num3.hashCode();
        }
        return i14 + i11;
    }

    public String toString() {
        Integer num = this.pageNumber;
        List<PaymentRecord> list = this.records;
        Integer num2 = this.totalPages;
        Integer num3 = this.totalRecords;
        return "PaymentHistoryEntity(pageNumber=" + num + ", records=" + list + ", totalPages=" + num2 + ", totalRecords=" + num3 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        Integer num = this.pageNumber;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        List<PaymentRecord> list = this.records;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (PaymentRecord paymentRecord : list) {
                paymentRecord.writeToParcel(out, i11);
            }
        }
        Integer num2 = this.totalPages;
        if (num2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num2.intValue());
        }
        Integer num3 = this.totalRecords;
        if (num3 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num3.intValue());
    }
}
