package com.forsale.app.datalayer.network.responses;

import com.forsale.app.datalayer.database.SearchPlaceholderKeywordEntity;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.LocaleManager;
import java.util.List;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import up.c;
/* compiled from: TrendsResponseBody.kt */
/* loaded from: classes2.dex */
public final class TrendsResponseBody {
    public static final int $stable = 8;
    @c("title")
    private final Label title;
    @c("trends")
    private final List<Label> trends;

    /* compiled from: TrendsResponseBody.kt */
    /* loaded from: classes2.dex */
    public static final class Label {
        public static final int $stable = 0;
        @c(SearchPlaceholderKeywordEntity.AR)

        /* renamed from: ar  reason: collision with root package name */
        private final String f22367ar;
        @c(SearchPlaceholderKeywordEntity.EN)

        /* renamed from: en  reason: collision with root package name */
        private final String f22368en;

        public Label(String ar2, String en2) {
            o.i(ar2, "ar");
            o.i(en2, "en");
            this.f22367ar = ar2;
            this.f22368en = en2;
        }

        public static /* synthetic */ Label copy$default(Label label, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = label.f22367ar;
            }
            if ((i11 & 2) != 0) {
                str2 = label.f22368en;
            }
            return label.copy(str, str2);
        }

        public final String component1() {
            return this.f22367ar;
        }

        public final String component2() {
            return this.f22368en;
        }

        public final Label copy(String ar2, String en2) {
            o.i(ar2, "ar");
            o.i(en2, "en");
            return new Label(ar2, en2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Label)) {
                return false;
            }
            Label label = (Label) obj;
            if (o.d(this.f22367ar, label.f22367ar) && o.d(this.f22368en, label.f22368en)) {
                return true;
            }
            return false;
        }

        public final String getAr() {
            return this.f22367ar;
        }

        public final String getEn() {
            return this.f22368en;
        }

        public final String getLocalized() {
            CharSequence Z0;
            CharSequence Z02;
            if (o.d(LocaleManager.f39597a.k(), Languages.ENGLISH.getValue())) {
                Z02 = StringsKt__StringsKt.Z0(this.f22368en);
                return Z02.toString();
            }
            Z0 = StringsKt__StringsKt.Z0(this.f22367ar);
            return Z0.toString();
        }

        public int hashCode() {
            return (this.f22367ar.hashCode() * 31) + this.f22368en.hashCode();
        }

        public String toString() {
            String str = this.f22367ar;
            String str2 = this.f22368en;
            return "Label(ar=" + str + ", en=" + str2 + ")";
        }
    }

    public TrendsResponseBody(Label title, List<Label> trends) {
        o.i(title, "title");
        o.i(trends, "trends");
        this.title = title;
        this.trends = trends;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendsResponseBody copy$default(TrendsResponseBody trendsResponseBody, Label label, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            label = trendsResponseBody.title;
        }
        if ((i11 & 2) != 0) {
            list = trendsResponseBody.trends;
        }
        return trendsResponseBody.copy(label, list);
    }

    public final Label component1() {
        return this.title;
    }

    public final List<Label> component2() {
        return this.trends;
    }

    public final TrendsResponseBody copy(Label title, List<Label> trends) {
        o.i(title, "title");
        o.i(trends, "trends");
        return new TrendsResponseBody(title, trends);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrendsResponseBody)) {
            return false;
        }
        TrendsResponseBody trendsResponseBody = (TrendsResponseBody) obj;
        if (o.d(this.title, trendsResponseBody.title) && o.d(this.trends, trendsResponseBody.trends)) {
            return true;
        }
        return false;
    }

    public final Label getTitle() {
        return this.title;
    }

    public final List<Label> getTrends() {
        return this.trends;
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.trends.hashCode();
    }

    public String toString() {
        Label label = this.title;
        List<Label> list = this.trends;
        return "TrendsResponseBody(title=" + label + ", trends=" + list + ")";
    }
}
