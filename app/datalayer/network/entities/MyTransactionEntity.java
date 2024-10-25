package com.forsale.app.datalayer.network.entities;

import com.forsale.app.datalayer.database.InAppMessageEntity;
import com.forsale.app.datalayer.network.entities.PaymentHistoryEntity;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.features.more.mytransactions.TransactionType;
import com.google.android.gms.ads.AdRequest;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* compiled from: MyTransactionEntity.kt */
/* loaded from: classes2.dex */
public final class MyTransactionEntity {
    public static final int $stable = 8;
    @c("page_number")
    private final int pageNumber;
    @c("records")
    private final List<Record> records;
    @c("total_pages")
    private final int totalPages;
    @c("total_records")
    private final int totalRecords;

    public MyTransactionEntity(int i11, List<Record> list, int i12, int i13) {
        this.pageNumber = i11;
        this.records = list;
        this.totalPages = i12;
        this.totalRecords = i13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MyTransactionEntity copy$default(MyTransactionEntity myTransactionEntity, int i11, List list, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i11 = myTransactionEntity.pageNumber;
        }
        if ((i14 & 2) != 0) {
            list = myTransactionEntity.records;
        }
        if ((i14 & 4) != 0) {
            i12 = myTransactionEntity.totalPages;
        }
        if ((i14 & 8) != 0) {
            i13 = myTransactionEntity.totalRecords;
        }
        return myTransactionEntity.copy(i11, list, i12, i13);
    }

    public final int component1() {
        return this.pageNumber;
    }

    public final List<Record> component2() {
        return this.records;
    }

    public final int component3() {
        return this.totalPages;
    }

    public final int component4() {
        return this.totalRecords;
    }

    public final MyTransactionEntity copy(int i11, List<Record> list, int i12, int i13) {
        return new MyTransactionEntity(i11, list, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MyTransactionEntity)) {
            return false;
        }
        MyTransactionEntity myTransactionEntity = (MyTransactionEntity) obj;
        if (this.pageNumber == myTransactionEntity.pageNumber && o.d(this.records, myTransactionEntity.records) && this.totalPages == myTransactionEntity.totalPages && this.totalRecords == myTransactionEntity.totalRecords) {
            return true;
        }
        return false;
    }

    public final int getPageNumber() {
        return this.pageNumber;
    }

    public final List<Record> getRecords() {
        return this.records;
    }

    public final int getTotalPages() {
        return this.totalPages;
    }

    public final int getTotalRecords() {
        return this.totalRecords;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.pageNumber) * 31;
        List<Record> list = this.records;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + Integer.hashCode(this.totalPages)) * 31) + Integer.hashCode(this.totalRecords);
    }

    public String toString() {
        int i11 = this.pageNumber;
        List<Record> list = this.records;
        int i12 = this.totalPages;
        int i13 = this.totalRecords;
        return "MyTransactionEntity(pageNumber=" + i11 + ", records=" + list + ", totalPages=" + i12 + ", totalRecords=" + i13 + ")";
    }

    /* compiled from: MyTransactionEntity.kt */
    /* loaded from: classes2.dex */
    public static final class Record {
        public static final int $stable = 8;
        @c("addon_app")
        private final String addonApp;
        @c(PaymentHistoryEntity.PaymentRecord.AMOUNT)
        private final Float amount;
        @c("cat_id")
        private final Integer catId;
        @c(ListingItemDetails.DATE_CREATED)
        private final String dateCreated;
        @c("districts_ids")
        private List<Integer> districtsIds;
        @c(InAppMessageEntity.ITEM_ID)
        private final String itemId;
        @c("item_title")
        private final String itemTitle;
        @c("knet_transaction_id")
        private final Integer knetTransactionId;
        @c(ListingItemDetails.SOURCE_APP)
        private final String sourceApp;
        @c("transaction_type")
        private final TransactionType transactionType;

        public Record(String str, Float f11, Integer num, List<Integer> list, String str2, String str3, String str4, Integer num2, String str5, TransactionType transactionType) {
            this.addonApp = str;
            this.amount = f11;
            this.catId = num;
            this.districtsIds = list;
            this.dateCreated = str2;
            this.itemId = str3;
            this.itemTitle = str4;
            this.knetTransactionId = num2;
            this.sourceApp = str5;
            this.transactionType = transactionType;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Record copy$default(Record record, String str, Float f11, Integer num, List list, String str2, String str3, String str4, Integer num2, String str5, TransactionType transactionType, int i11, Object obj) {
            String str6;
            Float f12;
            Integer num3;
            List<Integer> list2;
            String str7;
            String str8;
            String str9;
            Integer num4;
            String str10;
            TransactionType transactionType2;
            if ((i11 & 1) != 0) {
                str6 = record.addonApp;
            } else {
                str6 = str;
            }
            if ((i11 & 2) != 0) {
                f12 = record.amount;
            } else {
                f12 = f11;
            }
            if ((i11 & 4) != 0) {
                num3 = record.catId;
            } else {
                num3 = num;
            }
            if ((i11 & 8) != 0) {
                list2 = record.districtsIds;
            } else {
                list2 = list;
            }
            if ((i11 & 16) != 0) {
                str7 = record.dateCreated;
            } else {
                str7 = str2;
            }
            if ((i11 & 32) != 0) {
                str8 = record.itemId;
            } else {
                str8 = str3;
            }
            if ((i11 & 64) != 0) {
                str9 = record.itemTitle;
            } else {
                str9 = str4;
            }
            if ((i11 & 128) != 0) {
                num4 = record.knetTransactionId;
            } else {
                num4 = num2;
            }
            if ((i11 & 256) != 0) {
                str10 = record.sourceApp;
            } else {
                str10 = str5;
            }
            if ((i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                transactionType2 = record.transactionType;
            } else {
                transactionType2 = transactionType;
            }
            return record.copy(str6, f12, num3, list2, str7, str8, str9, num4, str10, transactionType2);
        }

        public final String component1() {
            return this.addonApp;
        }

        public final TransactionType component10() {
            return this.transactionType;
        }

        public final Float component2() {
            return this.amount;
        }

        public final Integer component3() {
            return this.catId;
        }

        public final List<Integer> component4() {
            return this.districtsIds;
        }

        public final String component5() {
            return this.dateCreated;
        }

        public final String component6() {
            return this.itemId;
        }

        public final String component7() {
            return this.itemTitle;
        }

        public final Integer component8() {
            return this.knetTransactionId;
        }

        public final String component9() {
            return this.sourceApp;
        }

        public final Record copy(String str, Float f11, Integer num, List<Integer> list, String str2, String str3, String str4, Integer num2, String str5, TransactionType transactionType) {
            return new Record(str, f11, num, list, str2, str3, str4, num2, str5, transactionType);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Record)) {
                return false;
            }
            Record record = (Record) obj;
            if (o.d(this.addonApp, record.addonApp) && o.d(this.amount, record.amount) && o.d(this.catId, record.catId) && o.d(this.districtsIds, record.districtsIds) && o.d(this.dateCreated, record.dateCreated) && o.d(this.itemId, record.itemId) && o.d(this.itemTitle, record.itemTitle) && o.d(this.knetTransactionId, record.knetTransactionId) && o.d(this.sourceApp, record.sourceApp) && this.transactionType == record.transactionType) {
                return true;
            }
            return false;
        }

        public final String getAddonApp() {
            return this.addonApp;
        }

        public final Float getAmount() {
            return this.amount;
        }

        public final Integer getCatId() {
            return this.catId;
        }

        public final String getDateCreated() {
            return this.dateCreated;
        }

        public final List<Integer> getDistrictsIds() {
            return this.districtsIds;
        }

        public final String getItemId() {
            return this.itemId;
        }

        public final String getItemTitle() {
            return this.itemTitle;
        }

        public final Integer getKnetTransactionId() {
            return this.knetTransactionId;
        }

        public final String getSourceApp() {
            return this.sourceApp;
        }

        public final TransactionType getTransactionType() {
            return this.transactionType;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8;
            int hashCode9;
            String str = this.addonApp;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = hashCode * 31;
            Float f11 = this.amount;
            if (f11 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = f11.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            Integer num = this.catId;
            if (num == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = num.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            List<Integer> list = this.districtsIds;
            if (list == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = list.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            String str2 = this.dateCreated;
            if (str2 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str2.hashCode();
            }
            int i16 = (i15 + hashCode5) * 31;
            String str3 = this.itemId;
            if (str3 == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = str3.hashCode();
            }
            int i17 = (i16 + hashCode6) * 31;
            String str4 = this.itemTitle;
            if (str4 == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = str4.hashCode();
            }
            int i18 = (i17 + hashCode7) * 31;
            Integer num2 = this.knetTransactionId;
            if (num2 == null) {
                hashCode8 = 0;
            } else {
                hashCode8 = num2.hashCode();
            }
            int i19 = (i18 + hashCode8) * 31;
            String str5 = this.sourceApp;
            if (str5 == null) {
                hashCode9 = 0;
            } else {
                hashCode9 = str5.hashCode();
            }
            int i21 = (i19 + hashCode9) * 31;
            TransactionType transactionType = this.transactionType;
            if (transactionType != null) {
                i11 = transactionType.hashCode();
            }
            return i21 + i11;
        }

        public final void setDistrictsIds(List<Integer> list) {
            this.districtsIds = list;
        }

        public String toString() {
            String str = this.addonApp;
            Float f11 = this.amount;
            Integer num = this.catId;
            List<Integer> list = this.districtsIds;
            String str2 = this.dateCreated;
            String str3 = this.itemId;
            String str4 = this.itemTitle;
            Integer num2 = this.knetTransactionId;
            String str5 = this.sourceApp;
            TransactionType transactionType = this.transactionType;
            return "Record(addonApp=" + str + ", amount=" + f11 + ", catId=" + num + ", districtsIds=" + list + ", dateCreated=" + str2 + ", itemId=" + str3 + ", itemTitle=" + str4 + ", knetTransactionId=" + num2 + ", sourceApp=" + str5 + ", transactionType=" + transactionType + ")";
        }

        public /* synthetic */ Record(String str, Float f11, Integer num, List list, String str2, String str3, String str4, Integer num2, String str5, TransactionType transactionType, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, f11, num, (i11 & 8) != 0 ? null : list, str2, str3, str4, num2, str5, transactionType);
        }
    }
}
