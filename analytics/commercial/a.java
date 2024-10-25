package com.forsale.analytics.commercial;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: CommercialEventsData.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* compiled from: CommercialEventsData.kt */
    /* renamed from: com.forsale.analytics.commercial.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0245a extends a {

        /* renamed from: a  reason: collision with root package name */
        private final CommercialType f21814a;

        /* renamed from: b  reason: collision with root package name */
        private final Integer f21815b;

        /* renamed from: c  reason: collision with root package name */
        private final String f21816c;

        /* renamed from: d  reason: collision with root package name */
        private final Boolean f21817d;

        /* renamed from: e  reason: collision with root package name */
        private final Integer f21818e;

        /* renamed from: f  reason: collision with root package name */
        private final Integer f21819f;

        /* compiled from: CommercialEventsData.kt */
        /* renamed from: com.forsale.analytics.commercial.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0246a extends AbstractC0245a {

            /* renamed from: g  reason: collision with root package name */
            private final CommercialType f21820g;

            /* renamed from: h  reason: collision with root package name */
            private final CommercialItemDetailsSource f21821h;

            /* renamed from: i  reason: collision with root package name */
            private final List<String> f21822i;

            /* renamed from: j  reason: collision with root package name */
            private final List<String> f21823j;

            /* renamed from: k  reason: collision with root package name */
            private final Integer f21824k;

            /* renamed from: l  reason: collision with root package name */
            private final String f21825l;

            /* renamed from: m  reason: collision with root package name */
            private final Boolean f21826m;

            /* renamed from: n  reason: collision with root package name */
            private final Integer f21827n;

            /* renamed from: o  reason: collision with root package name */
            private final String f21828o;

            /* renamed from: p  reason: collision with root package name */
            private final Integer f21829p;

            /* renamed from: q  reason: collision with root package name */
            private final List<Integer> f21830q;

            /* renamed from: r  reason: collision with root package name */
            private final List<String> f21831r;

            /* renamed from: s  reason: collision with root package name */
            private final Integer f21832s;

            /* renamed from: t  reason: collision with root package name */
            private final String f21833t;

            /* renamed from: u  reason: collision with root package name */
            private final Integer f21834u;

            /* renamed from: v  reason: collision with root package name */
            private final Integer f21835v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0246a(CommercialType commercialType, CommercialItemDetailsSource source, List<String> phoneNumbers, List<String> whatsAppNumbers, Integer num, String str, Boolean bool, Integer num2, String str2, Integer num3, List<Integer> list, List<String> list2, Integer num4, String str3, Integer num5, Integer num6) {
                super(commercialType, num, str, bool, num4, num5);
                o.i(commercialType, "commercialType");
                o.i(source, "source");
                o.i(phoneNumbers, "phoneNumbers");
                o.i(whatsAppNumbers, "whatsAppNumbers");
                this.f21820g = commercialType;
                this.f21821h = source;
                this.f21822i = phoneNumbers;
                this.f21823j = whatsAppNumbers;
                this.f21824k = num;
                this.f21825l = str;
                this.f21826m = bool;
                this.f21827n = num2;
                this.f21828o = str2;
                this.f21829p = num3;
                this.f21830q = list;
                this.f21831r = list2;
                this.f21832s = num4;
                this.f21833t = str3;
                this.f21834u = num5;
                this.f21835v = num6;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Integer a() {
                return this.f21824k;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public String b() {
                return this.f21825l;
            }

            @Override // com.forsale.analytics.commercial.a
            public String c() {
                return this.f21833t;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public CommercialType d() {
                return this.f21820g;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Boolean e() {
                return this.f21826m;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0246a)) {
                    return false;
                }
                C0246a c0246a = (C0246a) obj;
                if (this.f21820g == c0246a.f21820g && this.f21821h == c0246a.f21821h && o.d(this.f21822i, c0246a.f21822i) && o.d(this.f21823j, c0246a.f21823j) && o.d(this.f21824k, c0246a.f21824k) && o.d(this.f21825l, c0246a.f21825l) && o.d(this.f21826m, c0246a.f21826m) && o.d(this.f21827n, c0246a.f21827n) && o.d(this.f21828o, c0246a.f21828o) && o.d(this.f21829p, c0246a.f21829p) && o.d(this.f21830q, c0246a.f21830q) && o.d(this.f21831r, c0246a.f21831r) && o.d(this.f21832s, c0246a.f21832s) && o.d(this.f21833t, c0246a.f21833t) && o.d(this.f21834u, c0246a.f21834u) && o.d(this.f21835v, c0246a.f21835v)) {
                    return true;
                }
                return false;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer f() {
                return this.f21835v;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer g() {
                return this.f21834u;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> h() {
                return this.f21822i;
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
                int hashCode10;
                int hashCode11;
                int hashCode12 = ((((((this.f21820g.hashCode() * 31) + this.f21821h.hashCode()) * 31) + this.f21822i.hashCode()) * 31) + this.f21823j.hashCode()) * 31;
                Integer num = this.f21824k;
                int i11 = 0;
                if (num == null) {
                    hashCode = 0;
                } else {
                    hashCode = num.hashCode();
                }
                int i12 = (hashCode12 + hashCode) * 31;
                String str = this.f21825l;
                if (str == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str.hashCode();
                }
                int i13 = (i12 + hashCode2) * 31;
                Boolean bool = this.f21826m;
                if (bool == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = bool.hashCode();
                }
                int i14 = (i13 + hashCode3) * 31;
                Integer num2 = this.f21827n;
                if (num2 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = num2.hashCode();
                }
                int i15 = (i14 + hashCode4) * 31;
                String str2 = this.f21828o;
                if (str2 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str2.hashCode();
                }
                int i16 = (i15 + hashCode5) * 31;
                Integer num3 = this.f21829p;
                if (num3 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = num3.hashCode();
                }
                int i17 = (i16 + hashCode6) * 31;
                List<Integer> list = this.f21830q;
                if (list == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = list.hashCode();
                }
                int i18 = (i17 + hashCode7) * 31;
                List<String> list2 = this.f21831r;
                if (list2 == null) {
                    hashCode8 = 0;
                } else {
                    hashCode8 = list2.hashCode();
                }
                int i19 = (i18 + hashCode8) * 31;
                Integer num4 = this.f21832s;
                if (num4 == null) {
                    hashCode9 = 0;
                } else {
                    hashCode9 = num4.hashCode();
                }
                int i21 = (i19 + hashCode9) * 31;
                String str3 = this.f21833t;
                if (str3 == null) {
                    hashCode10 = 0;
                } else {
                    hashCode10 = str3.hashCode();
                }
                int i22 = (i21 + hashCode10) * 31;
                Integer num5 = this.f21834u;
                if (num5 == null) {
                    hashCode11 = 0;
                } else {
                    hashCode11 = num5.hashCode();
                }
                int i23 = (i22 + hashCode11) * 31;
                Integer num6 = this.f21835v;
                if (num6 != null) {
                    i11 = num6.hashCode();
                }
                return i23 + i11;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer i() {
                return this.f21832s;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public CommercialItemDetailsSource j() {
                return this.f21821h;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer k() {
                return this.f21827n;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public String l() {
                return this.f21828o;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer m() {
                return this.f21829p;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<Integer> n() {
                return this.f21830q;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> o() {
                return this.f21831r;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> p() {
                return this.f21823j;
            }

            public String toString() {
                return "CommercialDetailsCloseClicked(commercialType=" + this.f21820g + ", source=" + this.f21821h + ", phoneNumbers=" + this.f21822i + ", whatsAppNumbers=" + this.f21823j + ", commercialCategoryID=" + this.f21824k + ", commercialCategoryName=" + this.f21825l + ", isSourceSectionSelectedByUser=" + this.f21826m + ", sourceCarouselTotalItems=" + this.f21827n + ", sourceCategoryFullPath=" + this.f21828o + ", sourceItemOrder=" + this.f21829p + ", verticalsIDs=" + this.f21830q + ", verticalsNames=" + this.f21831r + ", positionCategoryId=" + this.f21832s + ", commercialTabName=" + this.f21833t + ", commercialWeight=" + this.f21834u + ", commercialItemId=" + this.f21835v + ')';
            }
        }

        /* compiled from: CommercialEventsData.kt */
        /* renamed from: com.forsale.analytics.commercial.a$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC0245a {

            /* renamed from: g  reason: collision with root package name */
            private final CommercialType f21836g;

            /* renamed from: h  reason: collision with root package name */
            private final CommercialItemDetailsSource f21837h;

            /* renamed from: i  reason: collision with root package name */
            private final List<String> f21838i;

            /* renamed from: j  reason: collision with root package name */
            private final List<String> f21839j;

            /* renamed from: k  reason: collision with root package name */
            private final Integer f21840k;

            /* renamed from: l  reason: collision with root package name */
            private final String f21841l;

            /* renamed from: m  reason: collision with root package name */
            private final Boolean f21842m;

            /* renamed from: n  reason: collision with root package name */
            private final Integer f21843n;

            /* renamed from: o  reason: collision with root package name */
            private final String f21844o;

            /* renamed from: p  reason: collision with root package name */
            private final Integer f21845p;

            /* renamed from: q  reason: collision with root package name */
            private final List<Integer> f21846q;

            /* renamed from: r  reason: collision with root package name */
            private final List<String> f21847r;

            /* renamed from: s  reason: collision with root package name */
            private final Integer f21848s;

            /* renamed from: t  reason: collision with root package name */
            private final String f21849t;

            /* renamed from: u  reason: collision with root package name */
            private final Integer f21850u;

            /* renamed from: v  reason: collision with root package name */
            private final Integer f21851v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(CommercialType commercialType, CommercialItemDetailsSource source, List<String> phoneNumbers, List<String> whatsAppNumbers, Integer num, String str, Boolean bool, Integer num2, String str2, Integer num3, List<Integer> list, List<String> list2, Integer num4, String str3, Integer num5, Integer num6) {
                super(commercialType, num, str, bool, num4, num5);
                o.i(commercialType, "commercialType");
                o.i(source, "source");
                o.i(phoneNumbers, "phoneNumbers");
                o.i(whatsAppNumbers, "whatsAppNumbers");
                this.f21836g = commercialType;
                this.f21837h = source;
                this.f21838i = phoneNumbers;
                this.f21839j = whatsAppNumbers;
                this.f21840k = num;
                this.f21841l = str;
                this.f21842m = bool;
                this.f21843n = num2;
                this.f21844o = str2;
                this.f21845p = num3;
                this.f21846q = list;
                this.f21847r = list2;
                this.f21848s = num4;
                this.f21849t = str3;
                this.f21850u = num5;
                this.f21851v = num6;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Integer a() {
                return this.f21840k;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public String b() {
                return this.f21841l;
            }

            @Override // com.forsale.analytics.commercial.a
            public String c() {
                return this.f21849t;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public CommercialType d() {
                return this.f21836g;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Boolean e() {
                return this.f21842m;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                if (this.f21836g == bVar.f21836g && this.f21837h == bVar.f21837h && o.d(this.f21838i, bVar.f21838i) && o.d(this.f21839j, bVar.f21839j) && o.d(this.f21840k, bVar.f21840k) && o.d(this.f21841l, bVar.f21841l) && o.d(this.f21842m, bVar.f21842m) && o.d(this.f21843n, bVar.f21843n) && o.d(this.f21844o, bVar.f21844o) && o.d(this.f21845p, bVar.f21845p) && o.d(this.f21846q, bVar.f21846q) && o.d(this.f21847r, bVar.f21847r) && o.d(this.f21848s, bVar.f21848s) && o.d(this.f21849t, bVar.f21849t) && o.d(this.f21850u, bVar.f21850u) && o.d(this.f21851v, bVar.f21851v)) {
                    return true;
                }
                return false;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer f() {
                return this.f21851v;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer g() {
                return this.f21850u;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> h() {
                return this.f21838i;
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
                int hashCode10;
                int hashCode11;
                int hashCode12 = ((((((this.f21836g.hashCode() * 31) + this.f21837h.hashCode()) * 31) + this.f21838i.hashCode()) * 31) + this.f21839j.hashCode()) * 31;
                Integer num = this.f21840k;
                int i11 = 0;
                if (num == null) {
                    hashCode = 0;
                } else {
                    hashCode = num.hashCode();
                }
                int i12 = (hashCode12 + hashCode) * 31;
                String str = this.f21841l;
                if (str == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str.hashCode();
                }
                int i13 = (i12 + hashCode2) * 31;
                Boolean bool = this.f21842m;
                if (bool == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = bool.hashCode();
                }
                int i14 = (i13 + hashCode3) * 31;
                Integer num2 = this.f21843n;
                if (num2 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = num2.hashCode();
                }
                int i15 = (i14 + hashCode4) * 31;
                String str2 = this.f21844o;
                if (str2 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str2.hashCode();
                }
                int i16 = (i15 + hashCode5) * 31;
                Integer num3 = this.f21845p;
                if (num3 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = num3.hashCode();
                }
                int i17 = (i16 + hashCode6) * 31;
                List<Integer> list = this.f21846q;
                if (list == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = list.hashCode();
                }
                int i18 = (i17 + hashCode7) * 31;
                List<String> list2 = this.f21847r;
                if (list2 == null) {
                    hashCode8 = 0;
                } else {
                    hashCode8 = list2.hashCode();
                }
                int i19 = (i18 + hashCode8) * 31;
                Integer num4 = this.f21848s;
                if (num4 == null) {
                    hashCode9 = 0;
                } else {
                    hashCode9 = num4.hashCode();
                }
                int i21 = (i19 + hashCode9) * 31;
                String str3 = this.f21849t;
                if (str3 == null) {
                    hashCode10 = 0;
                } else {
                    hashCode10 = str3.hashCode();
                }
                int i22 = (i21 + hashCode10) * 31;
                Integer num5 = this.f21850u;
                if (num5 == null) {
                    hashCode11 = 0;
                } else {
                    hashCode11 = num5.hashCode();
                }
                int i23 = (i22 + hashCode11) * 31;
                Integer num6 = this.f21851v;
                if (num6 != null) {
                    i11 = num6.hashCode();
                }
                return i23 + i11;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer i() {
                return this.f21848s;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public CommercialItemDetailsSource j() {
                return this.f21837h;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer k() {
                return this.f21843n;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public String l() {
                return this.f21844o;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer m() {
                return this.f21845p;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<Integer> n() {
                return this.f21846q;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> o() {
                return this.f21847r;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> p() {
                return this.f21839j;
            }

            public String toString() {
                return "CommercialDetailsDownloadClicked(commercialType=" + this.f21836g + ", source=" + this.f21837h + ", phoneNumbers=" + this.f21838i + ", whatsAppNumbers=" + this.f21839j + ", commercialCategoryID=" + this.f21840k + ", commercialCategoryName=" + this.f21841l + ", isSourceSectionSelectedByUser=" + this.f21842m + ", sourceCarouselTotalItems=" + this.f21843n + ", sourceCategoryFullPath=" + this.f21844o + ", sourceItemOrder=" + this.f21845p + ", verticalsIDs=" + this.f21846q + ", verticalsNames=" + this.f21847r + ", positionCategoryId=" + this.f21848s + ", commercialTabName=" + this.f21849t + ", commercialWeight=" + this.f21850u + ", commercialItemId=" + this.f21851v + ')';
            }
        }

        /* compiled from: CommercialEventsData.kt */
        /* renamed from: com.forsale.analytics.commercial.a$a$c */
        /* loaded from: classes2.dex */
        public static final class c extends AbstractC0245a {

            /* renamed from: g  reason: collision with root package name */
            private final CommercialType f21852g;

            /* renamed from: h  reason: collision with root package name */
            private final CommercialItemDetailsSource f21853h;

            /* renamed from: i  reason: collision with root package name */
            private final List<String> f21854i;

            /* renamed from: j  reason: collision with root package name */
            private final List<String> f21855j;

            /* renamed from: k  reason: collision with root package name */
            private final String f21856k;

            /* renamed from: l  reason: collision with root package name */
            private final Integer f21857l;

            /* renamed from: m  reason: collision with root package name */
            private final String f21858m;

            /* renamed from: n  reason: collision with root package name */
            private final Boolean f21859n;

            /* renamed from: o  reason: collision with root package name */
            private final Integer f21860o;

            /* renamed from: p  reason: collision with root package name */
            private final String f21861p;

            /* renamed from: q  reason: collision with root package name */
            private final Integer f21862q;

            /* renamed from: r  reason: collision with root package name */
            private final List<Integer> f21863r;

            /* renamed from: s  reason: collision with root package name */
            private final List<String> f21864s;

            /* renamed from: t  reason: collision with root package name */
            private final Integer f21865t;

            /* renamed from: u  reason: collision with root package name */
            private final String f21866u;

            /* renamed from: v  reason: collision with root package name */
            private final Integer f21867v;

            /* renamed from: w  reason: collision with root package name */
            private final Integer f21868w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CommercialType commercialType, CommercialItemDetailsSource source, List<String> phoneNumbers, List<String> whatsAppNumbers, String phoneNumber, Integer num, String str, Boolean bool, Integer num2, String str2, Integer num3, List<Integer> list, List<String> list2, Integer num4, String str3, Integer num5, Integer num6) {
                super(commercialType, num, str, bool, num4, num5);
                o.i(commercialType, "commercialType");
                o.i(source, "source");
                o.i(phoneNumbers, "phoneNumbers");
                o.i(whatsAppNumbers, "whatsAppNumbers");
                o.i(phoneNumber, "phoneNumber");
                this.f21852g = commercialType;
                this.f21853h = source;
                this.f21854i = phoneNumbers;
                this.f21855j = whatsAppNumbers;
                this.f21856k = phoneNumber;
                this.f21857l = num;
                this.f21858m = str;
                this.f21859n = bool;
                this.f21860o = num2;
                this.f21861p = str2;
                this.f21862q = num3;
                this.f21863r = list;
                this.f21864s = list2;
                this.f21865t = num4;
                this.f21866u = str3;
                this.f21867v = num5;
                this.f21868w = num6;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Integer a() {
                return this.f21857l;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public String b() {
                return this.f21858m;
            }

            @Override // com.forsale.analytics.commercial.a
            public String c() {
                return this.f21866u;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public CommercialType d() {
                return this.f21852g;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Boolean e() {
                return this.f21859n;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                if (this.f21852g == cVar.f21852g && this.f21853h == cVar.f21853h && o.d(this.f21854i, cVar.f21854i) && o.d(this.f21855j, cVar.f21855j) && o.d(this.f21856k, cVar.f21856k) && o.d(this.f21857l, cVar.f21857l) && o.d(this.f21858m, cVar.f21858m) && o.d(this.f21859n, cVar.f21859n) && o.d(this.f21860o, cVar.f21860o) && o.d(this.f21861p, cVar.f21861p) && o.d(this.f21862q, cVar.f21862q) && o.d(this.f21863r, cVar.f21863r) && o.d(this.f21864s, cVar.f21864s) && o.d(this.f21865t, cVar.f21865t) && o.d(this.f21866u, cVar.f21866u) && o.d(this.f21867v, cVar.f21867v) && o.d(this.f21868w, cVar.f21868w)) {
                    return true;
                }
                return false;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer f() {
                return this.f21868w;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer g() {
                return this.f21867v;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> h() {
                return this.f21854i;
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
                int hashCode10;
                int hashCode11;
                int hashCode12 = ((((((((this.f21852g.hashCode() * 31) + this.f21853h.hashCode()) * 31) + this.f21854i.hashCode()) * 31) + this.f21855j.hashCode()) * 31) + this.f21856k.hashCode()) * 31;
                Integer num = this.f21857l;
                int i11 = 0;
                if (num == null) {
                    hashCode = 0;
                } else {
                    hashCode = num.hashCode();
                }
                int i12 = (hashCode12 + hashCode) * 31;
                String str = this.f21858m;
                if (str == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str.hashCode();
                }
                int i13 = (i12 + hashCode2) * 31;
                Boolean bool = this.f21859n;
                if (bool == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = bool.hashCode();
                }
                int i14 = (i13 + hashCode3) * 31;
                Integer num2 = this.f21860o;
                if (num2 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = num2.hashCode();
                }
                int i15 = (i14 + hashCode4) * 31;
                String str2 = this.f21861p;
                if (str2 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str2.hashCode();
                }
                int i16 = (i15 + hashCode5) * 31;
                Integer num3 = this.f21862q;
                if (num3 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = num3.hashCode();
                }
                int i17 = (i16 + hashCode6) * 31;
                List<Integer> list = this.f21863r;
                if (list == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = list.hashCode();
                }
                int i18 = (i17 + hashCode7) * 31;
                List<String> list2 = this.f21864s;
                if (list2 == null) {
                    hashCode8 = 0;
                } else {
                    hashCode8 = list2.hashCode();
                }
                int i19 = (i18 + hashCode8) * 31;
                Integer num4 = this.f21865t;
                if (num4 == null) {
                    hashCode9 = 0;
                } else {
                    hashCode9 = num4.hashCode();
                }
                int i21 = (i19 + hashCode9) * 31;
                String str3 = this.f21866u;
                if (str3 == null) {
                    hashCode10 = 0;
                } else {
                    hashCode10 = str3.hashCode();
                }
                int i22 = (i21 + hashCode10) * 31;
                Integer num5 = this.f21867v;
                if (num5 == null) {
                    hashCode11 = 0;
                } else {
                    hashCode11 = num5.hashCode();
                }
                int i23 = (i22 + hashCode11) * 31;
                Integer num6 = this.f21868w;
                if (num6 != null) {
                    i11 = num6.hashCode();
                }
                return i23 + i11;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer i() {
                return this.f21865t;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public CommercialItemDetailsSource j() {
                return this.f21853h;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer k() {
                return this.f21860o;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public String l() {
                return this.f21861p;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer m() {
                return this.f21862q;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<Integer> n() {
                return this.f21863r;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> o() {
                return this.f21864s;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> p() {
                return this.f21855j;
            }

            public final String q() {
                return this.f21856k;
            }

            public String toString() {
                return "CommercialDetailsPhoneClicked(commercialType=" + this.f21852g + ", source=" + this.f21853h + ", phoneNumbers=" + this.f21854i + ", whatsAppNumbers=" + this.f21855j + ", phoneNumber=" + this.f21856k + ", commercialCategoryID=" + this.f21857l + ", commercialCategoryName=" + this.f21858m + ", isSourceSectionSelectedByUser=" + this.f21859n + ", sourceCarouselTotalItems=" + this.f21860o + ", sourceCategoryFullPath=" + this.f21861p + ", sourceItemOrder=" + this.f21862q + ", verticalsIDs=" + this.f21863r + ", verticalsNames=" + this.f21864s + ", positionCategoryId=" + this.f21865t + ", commercialTabName=" + this.f21866u + ", commercialWeight=" + this.f21867v + ", commercialItemId=" + this.f21868w + ')';
            }
        }

        /* compiled from: CommercialEventsData.kt */
        /* renamed from: com.forsale.analytics.commercial.a$a$d */
        /* loaded from: classes2.dex */
        public static final class d extends AbstractC0245a {

            /* renamed from: g  reason: collision with root package name */
            private final CommercialType f21869g;

            /* renamed from: h  reason: collision with root package name */
            private final CommercialItemDetailsSource f21870h;

            /* renamed from: i  reason: collision with root package name */
            private final List<String> f21871i;

            /* renamed from: j  reason: collision with root package name */
            private final List<String> f21872j;

            /* renamed from: k  reason: collision with root package name */
            private final Integer f21873k;

            /* renamed from: l  reason: collision with root package name */
            private final String f21874l;

            /* renamed from: m  reason: collision with root package name */
            private final Boolean f21875m;

            /* renamed from: n  reason: collision with root package name */
            private final Integer f21876n;

            /* renamed from: o  reason: collision with root package name */
            private final String f21877o;

            /* renamed from: p  reason: collision with root package name */
            private final Integer f21878p;

            /* renamed from: q  reason: collision with root package name */
            private final List<Integer> f21879q;

            /* renamed from: r  reason: collision with root package name */
            private final List<String> f21880r;

            /* renamed from: s  reason: collision with root package name */
            private final Integer f21881s;

            /* renamed from: t  reason: collision with root package name */
            private final String f21882t;

            /* renamed from: u  reason: collision with root package name */
            private final Integer f21883u;

            /* renamed from: v  reason: collision with root package name */
            private final Integer f21884v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(CommercialType commercialType, CommercialItemDetailsSource source, List<String> phoneNumbers, List<String> whatsAppNumbers, Integer num, String str, Boolean bool, Integer num2, String str2, Integer num3, List<Integer> list, List<String> list2, Integer num4, String str3, Integer num5, Integer num6) {
                super(commercialType, num, str, bool, num4, num5);
                o.i(commercialType, "commercialType");
                o.i(source, "source");
                o.i(phoneNumbers, "phoneNumbers");
                o.i(whatsAppNumbers, "whatsAppNumbers");
                this.f21869g = commercialType;
                this.f21870h = source;
                this.f21871i = phoneNumbers;
                this.f21872j = whatsAppNumbers;
                this.f21873k = num;
                this.f21874l = str;
                this.f21875m = bool;
                this.f21876n = num2;
                this.f21877o = str2;
                this.f21878p = num3;
                this.f21879q = list;
                this.f21880r = list2;
                this.f21881s = num4;
                this.f21882t = str3;
                this.f21883u = num5;
                this.f21884v = num6;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Integer a() {
                return this.f21873k;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public String b() {
                return this.f21874l;
            }

            @Override // com.forsale.analytics.commercial.a
            public String c() {
                return this.f21882t;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public CommercialType d() {
                return this.f21869g;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Boolean e() {
                return this.f21875m;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                if (this.f21869g == dVar.f21869g && this.f21870h == dVar.f21870h && o.d(this.f21871i, dVar.f21871i) && o.d(this.f21872j, dVar.f21872j) && o.d(this.f21873k, dVar.f21873k) && o.d(this.f21874l, dVar.f21874l) && o.d(this.f21875m, dVar.f21875m) && o.d(this.f21876n, dVar.f21876n) && o.d(this.f21877o, dVar.f21877o) && o.d(this.f21878p, dVar.f21878p) && o.d(this.f21879q, dVar.f21879q) && o.d(this.f21880r, dVar.f21880r) && o.d(this.f21881s, dVar.f21881s) && o.d(this.f21882t, dVar.f21882t) && o.d(this.f21883u, dVar.f21883u) && o.d(this.f21884v, dVar.f21884v)) {
                    return true;
                }
                return false;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer f() {
                return this.f21884v;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer g() {
                return this.f21883u;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> h() {
                return this.f21871i;
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
                int hashCode10;
                int hashCode11;
                int hashCode12 = ((((((this.f21869g.hashCode() * 31) + this.f21870h.hashCode()) * 31) + this.f21871i.hashCode()) * 31) + this.f21872j.hashCode()) * 31;
                Integer num = this.f21873k;
                int i11 = 0;
                if (num == null) {
                    hashCode = 0;
                } else {
                    hashCode = num.hashCode();
                }
                int i12 = (hashCode12 + hashCode) * 31;
                String str = this.f21874l;
                if (str == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str.hashCode();
                }
                int i13 = (i12 + hashCode2) * 31;
                Boolean bool = this.f21875m;
                if (bool == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = bool.hashCode();
                }
                int i14 = (i13 + hashCode3) * 31;
                Integer num2 = this.f21876n;
                if (num2 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = num2.hashCode();
                }
                int i15 = (i14 + hashCode4) * 31;
                String str2 = this.f21877o;
                if (str2 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str2.hashCode();
                }
                int i16 = (i15 + hashCode5) * 31;
                Integer num3 = this.f21878p;
                if (num3 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = num3.hashCode();
                }
                int i17 = (i16 + hashCode6) * 31;
                List<Integer> list = this.f21879q;
                if (list == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = list.hashCode();
                }
                int i18 = (i17 + hashCode7) * 31;
                List<String> list2 = this.f21880r;
                if (list2 == null) {
                    hashCode8 = 0;
                } else {
                    hashCode8 = list2.hashCode();
                }
                int i19 = (i18 + hashCode8) * 31;
                Integer num4 = this.f21881s;
                if (num4 == null) {
                    hashCode9 = 0;
                } else {
                    hashCode9 = num4.hashCode();
                }
                int i21 = (i19 + hashCode9) * 31;
                String str3 = this.f21882t;
                if (str3 == null) {
                    hashCode10 = 0;
                } else {
                    hashCode10 = str3.hashCode();
                }
                int i22 = (i21 + hashCode10) * 31;
                Integer num5 = this.f21883u;
                if (num5 == null) {
                    hashCode11 = 0;
                } else {
                    hashCode11 = num5.hashCode();
                }
                int i23 = (i22 + hashCode11) * 31;
                Integer num6 = this.f21884v;
                if (num6 != null) {
                    i11 = num6.hashCode();
                }
                return i23 + i11;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer i() {
                return this.f21881s;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public CommercialItemDetailsSource j() {
                return this.f21870h;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer k() {
                return this.f21876n;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public String l() {
                return this.f21877o;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer m() {
                return this.f21878p;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<Integer> n() {
                return this.f21879q;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> o() {
                return this.f21880r;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> p() {
                return this.f21872j;
            }

            public String toString() {
                return "CommercialDetailsPhoneIconClicked(commercialType=" + this.f21869g + ", source=" + this.f21870h + ", phoneNumbers=" + this.f21871i + ", whatsAppNumbers=" + this.f21872j + ", commercialCategoryID=" + this.f21873k + ", commercialCategoryName=" + this.f21874l + ", isSourceSectionSelectedByUser=" + this.f21875m + ", sourceCarouselTotalItems=" + this.f21876n + ", sourceCategoryFullPath=" + this.f21877o + ", sourceItemOrder=" + this.f21878p + ", verticalsIDs=" + this.f21879q + ", verticalsNames=" + this.f21880r + ", positionCategoryId=" + this.f21881s + ", commercialTabName=" + this.f21882t + ", commercialWeight=" + this.f21883u + ", commercialItemId=" + this.f21884v + ')';
            }
        }

        /* compiled from: CommercialEventsData.kt */
        /* renamed from: com.forsale.analytics.commercial.a$a$e */
        /* loaded from: classes2.dex */
        public static final class e extends AbstractC0245a {

            /* renamed from: g  reason: collision with root package name */
            private final CommercialType f21885g;

            /* renamed from: h  reason: collision with root package name */
            private final CommercialItemDetailsSource f21886h;

            /* renamed from: i  reason: collision with root package name */
            private final List<String> f21887i;

            /* renamed from: j  reason: collision with root package name */
            private final List<String> f21888j;

            /* renamed from: k  reason: collision with root package name */
            private final Integer f21889k;

            /* renamed from: l  reason: collision with root package name */
            private final String f21890l;

            /* renamed from: m  reason: collision with root package name */
            private final Boolean f21891m;

            /* renamed from: n  reason: collision with root package name */
            private final Integer f21892n;

            /* renamed from: o  reason: collision with root package name */
            private final String f21893o;

            /* renamed from: p  reason: collision with root package name */
            private final Integer f21894p;

            /* renamed from: q  reason: collision with root package name */
            private final List<Integer> f21895q;

            /* renamed from: r  reason: collision with root package name */
            private final List<String> f21896r;

            /* renamed from: s  reason: collision with root package name */
            private final Integer f21897s;

            /* renamed from: t  reason: collision with root package name */
            private final String f21898t;

            /* renamed from: u  reason: collision with root package name */
            private final Integer f21899u;

            /* renamed from: v  reason: collision with root package name */
            private final Integer f21900v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(CommercialType commercialType, CommercialItemDetailsSource source, List<String> phoneNumbers, List<String> whatsAppNumbers, Integer num, String str, Boolean bool, Integer num2, String str2, Integer num3, List<Integer> list, List<String> list2, Integer num4, String str3, Integer num5, Integer num6) {
                super(commercialType, num, str, bool, num4, num5);
                o.i(commercialType, "commercialType");
                o.i(source, "source");
                o.i(phoneNumbers, "phoneNumbers");
                o.i(whatsAppNumbers, "whatsAppNumbers");
                this.f21885g = commercialType;
                this.f21886h = source;
                this.f21887i = phoneNumbers;
                this.f21888j = whatsAppNumbers;
                this.f21889k = num;
                this.f21890l = str;
                this.f21891m = bool;
                this.f21892n = num2;
                this.f21893o = str2;
                this.f21894p = num3;
                this.f21895q = list;
                this.f21896r = list2;
                this.f21897s = num4;
                this.f21898t = str3;
                this.f21899u = num5;
                this.f21900v = num6;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Integer a() {
                return this.f21889k;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public String b() {
                return this.f21890l;
            }

            @Override // com.forsale.analytics.commercial.a
            public String c() {
                return this.f21898t;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public CommercialType d() {
                return this.f21885g;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Boolean e() {
                return this.f21891m;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof e)) {
                    return false;
                }
                e eVar = (e) obj;
                if (this.f21885g == eVar.f21885g && this.f21886h == eVar.f21886h && o.d(this.f21887i, eVar.f21887i) && o.d(this.f21888j, eVar.f21888j) && o.d(this.f21889k, eVar.f21889k) && o.d(this.f21890l, eVar.f21890l) && o.d(this.f21891m, eVar.f21891m) && o.d(this.f21892n, eVar.f21892n) && o.d(this.f21893o, eVar.f21893o) && o.d(this.f21894p, eVar.f21894p) && o.d(this.f21895q, eVar.f21895q) && o.d(this.f21896r, eVar.f21896r) && o.d(this.f21897s, eVar.f21897s) && o.d(this.f21898t, eVar.f21898t) && o.d(this.f21899u, eVar.f21899u) && o.d(this.f21900v, eVar.f21900v)) {
                    return true;
                }
                return false;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer f() {
                return this.f21900v;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer g() {
                return this.f21899u;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> h() {
                return this.f21887i;
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
                int hashCode10;
                int hashCode11;
                int hashCode12 = ((((((this.f21885g.hashCode() * 31) + this.f21886h.hashCode()) * 31) + this.f21887i.hashCode()) * 31) + this.f21888j.hashCode()) * 31;
                Integer num = this.f21889k;
                int i11 = 0;
                if (num == null) {
                    hashCode = 0;
                } else {
                    hashCode = num.hashCode();
                }
                int i12 = (hashCode12 + hashCode) * 31;
                String str = this.f21890l;
                if (str == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str.hashCode();
                }
                int i13 = (i12 + hashCode2) * 31;
                Boolean bool = this.f21891m;
                if (bool == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = bool.hashCode();
                }
                int i14 = (i13 + hashCode3) * 31;
                Integer num2 = this.f21892n;
                if (num2 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = num2.hashCode();
                }
                int i15 = (i14 + hashCode4) * 31;
                String str2 = this.f21893o;
                if (str2 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str2.hashCode();
                }
                int i16 = (i15 + hashCode5) * 31;
                Integer num3 = this.f21894p;
                if (num3 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = num3.hashCode();
                }
                int i17 = (i16 + hashCode6) * 31;
                List<Integer> list = this.f21895q;
                if (list == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = list.hashCode();
                }
                int i18 = (i17 + hashCode7) * 31;
                List<String> list2 = this.f21896r;
                if (list2 == null) {
                    hashCode8 = 0;
                } else {
                    hashCode8 = list2.hashCode();
                }
                int i19 = (i18 + hashCode8) * 31;
                Integer num4 = this.f21897s;
                if (num4 == null) {
                    hashCode9 = 0;
                } else {
                    hashCode9 = num4.hashCode();
                }
                int i21 = (i19 + hashCode9) * 31;
                String str3 = this.f21898t;
                if (str3 == null) {
                    hashCode10 = 0;
                } else {
                    hashCode10 = str3.hashCode();
                }
                int i22 = (i21 + hashCode10) * 31;
                Integer num5 = this.f21899u;
                if (num5 == null) {
                    hashCode11 = 0;
                } else {
                    hashCode11 = num5.hashCode();
                }
                int i23 = (i22 + hashCode11) * 31;
                Integer num6 = this.f21900v;
                if (num6 != null) {
                    i11 = num6.hashCode();
                }
                return i23 + i11;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer i() {
                return this.f21897s;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public CommercialItemDetailsSource j() {
                return this.f21886h;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer k() {
                return this.f21892n;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public String l() {
                return this.f21893o;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer m() {
                return this.f21894p;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<Integer> n() {
                return this.f21895q;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> o() {
                return this.f21896r;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> p() {
                return this.f21888j;
            }

            public String toString() {
                return "CommercialDetailsShareClicked(commercialType=" + this.f21885g + ", source=" + this.f21886h + ", phoneNumbers=" + this.f21887i + ", whatsAppNumbers=" + this.f21888j + ", commercialCategoryID=" + this.f21889k + ", commercialCategoryName=" + this.f21890l + ", isSourceSectionSelectedByUser=" + this.f21891m + ", sourceCarouselTotalItems=" + this.f21892n + ", sourceCategoryFullPath=" + this.f21893o + ", sourceItemOrder=" + this.f21894p + ", verticalsIDs=" + this.f21895q + ", verticalsNames=" + this.f21896r + ", positionCategoryId=" + this.f21897s + ", commercialTabName=" + this.f21898t + ", commercialWeight=" + this.f21899u + ", commercialItemId=" + this.f21900v + ')';
            }
        }

        /* compiled from: CommercialEventsData.kt */
        /* renamed from: com.forsale.analytics.commercial.a$a$f */
        /* loaded from: classes2.dex */
        public static final class f extends AbstractC0245a {

            /* renamed from: g  reason: collision with root package name */
            private final CommercialType f21901g;

            /* renamed from: h  reason: collision with root package name */
            private final CommercialItemDetailsSource f21902h;

            /* renamed from: i  reason: collision with root package name */
            private final List<String> f21903i;

            /* renamed from: j  reason: collision with root package name */
            private final List<String> f21904j;

            /* renamed from: k  reason: collision with root package name */
            private final Integer f21905k;

            /* renamed from: l  reason: collision with root package name */
            private final String f21906l;

            /* renamed from: m  reason: collision with root package name */
            private final Boolean f21907m;

            /* renamed from: n  reason: collision with root package name */
            private final Integer f21908n;

            /* renamed from: o  reason: collision with root package name */
            private final String f21909o;

            /* renamed from: p  reason: collision with root package name */
            private final Integer f21910p;

            /* renamed from: q  reason: collision with root package name */
            private final List<Integer> f21911q;

            /* renamed from: r  reason: collision with root package name */
            private final List<String> f21912r;

            /* renamed from: s  reason: collision with root package name */
            private final Integer f21913s;

            /* renamed from: t  reason: collision with root package name */
            private final String f21914t;

            /* renamed from: u  reason: collision with root package name */
            private final Integer f21915u;

            /* renamed from: v  reason: collision with root package name */
            private final Integer f21916v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(CommercialType commercialType, CommercialItemDetailsSource source, List<String> phoneNumbers, List<String> whatsAppNumbers, Integer num, String str, Boolean bool, Integer num2, String str2, Integer num3, List<Integer> list, List<String> list2, Integer num4, String str3, Integer num5, Integer num6) {
                super(commercialType, num, str, bool, num4, num5);
                o.i(commercialType, "commercialType");
                o.i(source, "source");
                o.i(phoneNumbers, "phoneNumbers");
                o.i(whatsAppNumbers, "whatsAppNumbers");
                this.f21901g = commercialType;
                this.f21902h = source;
                this.f21903i = phoneNumbers;
                this.f21904j = whatsAppNumbers;
                this.f21905k = num;
                this.f21906l = str;
                this.f21907m = bool;
                this.f21908n = num2;
                this.f21909o = str2;
                this.f21910p = num3;
                this.f21911q = list;
                this.f21912r = list2;
                this.f21913s = num4;
                this.f21914t = str3;
                this.f21915u = num5;
                this.f21916v = num6;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Integer a() {
                return this.f21905k;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public String b() {
                return this.f21906l;
            }

            @Override // com.forsale.analytics.commercial.a
            public String c() {
                return this.f21914t;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public CommercialType d() {
                return this.f21901g;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Boolean e() {
                return this.f21907m;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                if (this.f21901g == fVar.f21901g && this.f21902h == fVar.f21902h && o.d(this.f21903i, fVar.f21903i) && o.d(this.f21904j, fVar.f21904j) && o.d(this.f21905k, fVar.f21905k) && o.d(this.f21906l, fVar.f21906l) && o.d(this.f21907m, fVar.f21907m) && o.d(this.f21908n, fVar.f21908n) && o.d(this.f21909o, fVar.f21909o) && o.d(this.f21910p, fVar.f21910p) && o.d(this.f21911q, fVar.f21911q) && o.d(this.f21912r, fVar.f21912r) && o.d(this.f21913s, fVar.f21913s) && o.d(this.f21914t, fVar.f21914t) && o.d(this.f21915u, fVar.f21915u) && o.d(this.f21916v, fVar.f21916v)) {
                    return true;
                }
                return false;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer f() {
                return this.f21916v;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer g() {
                return this.f21915u;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> h() {
                return this.f21903i;
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
                int hashCode10;
                int hashCode11;
                int hashCode12 = ((((((this.f21901g.hashCode() * 31) + this.f21902h.hashCode()) * 31) + this.f21903i.hashCode()) * 31) + this.f21904j.hashCode()) * 31;
                Integer num = this.f21905k;
                int i11 = 0;
                if (num == null) {
                    hashCode = 0;
                } else {
                    hashCode = num.hashCode();
                }
                int i12 = (hashCode12 + hashCode) * 31;
                String str = this.f21906l;
                if (str == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str.hashCode();
                }
                int i13 = (i12 + hashCode2) * 31;
                Boolean bool = this.f21907m;
                if (bool == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = bool.hashCode();
                }
                int i14 = (i13 + hashCode3) * 31;
                Integer num2 = this.f21908n;
                if (num2 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = num2.hashCode();
                }
                int i15 = (i14 + hashCode4) * 31;
                String str2 = this.f21909o;
                if (str2 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str2.hashCode();
                }
                int i16 = (i15 + hashCode5) * 31;
                Integer num3 = this.f21910p;
                if (num3 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = num3.hashCode();
                }
                int i17 = (i16 + hashCode6) * 31;
                List<Integer> list = this.f21911q;
                if (list == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = list.hashCode();
                }
                int i18 = (i17 + hashCode7) * 31;
                List<String> list2 = this.f21912r;
                if (list2 == null) {
                    hashCode8 = 0;
                } else {
                    hashCode8 = list2.hashCode();
                }
                int i19 = (i18 + hashCode8) * 31;
                Integer num4 = this.f21913s;
                if (num4 == null) {
                    hashCode9 = 0;
                } else {
                    hashCode9 = num4.hashCode();
                }
                int i21 = (i19 + hashCode9) * 31;
                String str3 = this.f21914t;
                if (str3 == null) {
                    hashCode10 = 0;
                } else {
                    hashCode10 = str3.hashCode();
                }
                int i22 = (i21 + hashCode10) * 31;
                Integer num5 = this.f21915u;
                if (num5 == null) {
                    hashCode11 = 0;
                } else {
                    hashCode11 = num5.hashCode();
                }
                int i23 = (i22 + hashCode11) * 31;
                Integer num6 = this.f21916v;
                if (num6 != null) {
                    i11 = num6.hashCode();
                }
                return i23 + i11;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer i() {
                return this.f21913s;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public CommercialItemDetailsSource j() {
                return this.f21902h;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer k() {
                return this.f21908n;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public String l() {
                return this.f21909o;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer m() {
                return this.f21910p;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<Integer> n() {
                return this.f21911q;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> o() {
                return this.f21912r;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> p() {
                return this.f21904j;
            }

            public String toString() {
                return "CommercialDetailsVisited(commercialType=" + this.f21901g + ", source=" + this.f21902h + ", phoneNumbers=" + this.f21903i + ", whatsAppNumbers=" + this.f21904j + ", commercialCategoryID=" + this.f21905k + ", commercialCategoryName=" + this.f21906l + ", isSourceSectionSelectedByUser=" + this.f21907m + ", sourceCarouselTotalItems=" + this.f21908n + ", sourceCategoryFullPath=" + this.f21909o + ", sourceItemOrder=" + this.f21910p + ", verticalsIDs=" + this.f21911q + ", verticalsNames=" + this.f21912r + ", positionCategoryId=" + this.f21913s + ", commercialTabName=" + this.f21914t + ", commercialWeight=" + this.f21915u + ", commercialItemId=" + this.f21916v + ')';
            }
        }

        /* compiled from: CommercialEventsData.kt */
        /* renamed from: com.forsale.analytics.commercial.a$a$g */
        /* loaded from: classes2.dex */
        public static final class g extends AbstractC0245a {

            /* renamed from: g  reason: collision with root package name */
            private final CommercialType f21917g;

            /* renamed from: h  reason: collision with root package name */
            private final CommercialItemDetailsSource f21918h;

            /* renamed from: i  reason: collision with root package name */
            private final List<String> f21919i;

            /* renamed from: j  reason: collision with root package name */
            private final List<String> f21920j;

            /* renamed from: k  reason: collision with root package name */
            private final String f21921k;

            /* renamed from: l  reason: collision with root package name */
            private final Integer f21922l;

            /* renamed from: m  reason: collision with root package name */
            private final String f21923m;

            /* renamed from: n  reason: collision with root package name */
            private final Boolean f21924n;

            /* renamed from: o  reason: collision with root package name */
            private final Integer f21925o;

            /* renamed from: p  reason: collision with root package name */
            private final String f21926p;

            /* renamed from: q  reason: collision with root package name */
            private final Integer f21927q;

            /* renamed from: r  reason: collision with root package name */
            private final List<Integer> f21928r;

            /* renamed from: s  reason: collision with root package name */
            private final List<String> f21929s;

            /* renamed from: t  reason: collision with root package name */
            private final Integer f21930t;

            /* renamed from: u  reason: collision with root package name */
            private final String f21931u;

            /* renamed from: v  reason: collision with root package name */
            private final Integer f21932v;

            /* renamed from: w  reason: collision with root package name */
            private final Integer f21933w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(CommercialType commercialType, CommercialItemDetailsSource source, List<String> phoneNumbers, List<String> whatsAppNumbers, String whatsappNumber, Integer num, String str, Boolean bool, Integer num2, String str2, Integer num3, List<Integer> list, List<String> list2, Integer num4, String str3, Integer num5, Integer num6) {
                super(commercialType, num, str, bool, num4, num5);
                o.i(commercialType, "commercialType");
                o.i(source, "source");
                o.i(phoneNumbers, "phoneNumbers");
                o.i(whatsAppNumbers, "whatsAppNumbers");
                o.i(whatsappNumber, "whatsappNumber");
                this.f21917g = commercialType;
                this.f21918h = source;
                this.f21919i = phoneNumbers;
                this.f21920j = whatsAppNumbers;
                this.f21921k = whatsappNumber;
                this.f21922l = num;
                this.f21923m = str;
                this.f21924n = bool;
                this.f21925o = num2;
                this.f21926p = str2;
                this.f21927q = num3;
                this.f21928r = list;
                this.f21929s = list2;
                this.f21930t = num4;
                this.f21931u = str3;
                this.f21932v = num5;
                this.f21933w = num6;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Integer a() {
                return this.f21922l;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public String b() {
                return this.f21923m;
            }

            @Override // com.forsale.analytics.commercial.a
            public String c() {
                return this.f21931u;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public CommercialType d() {
                return this.f21917g;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a, com.forsale.analytics.commercial.a
            public Boolean e() {
                return this.f21924n;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof g)) {
                    return false;
                }
                g gVar = (g) obj;
                if (this.f21917g == gVar.f21917g && this.f21918h == gVar.f21918h && o.d(this.f21919i, gVar.f21919i) && o.d(this.f21920j, gVar.f21920j) && o.d(this.f21921k, gVar.f21921k) && o.d(this.f21922l, gVar.f21922l) && o.d(this.f21923m, gVar.f21923m) && o.d(this.f21924n, gVar.f21924n) && o.d(this.f21925o, gVar.f21925o) && o.d(this.f21926p, gVar.f21926p) && o.d(this.f21927q, gVar.f21927q) && o.d(this.f21928r, gVar.f21928r) && o.d(this.f21929s, gVar.f21929s) && o.d(this.f21930t, gVar.f21930t) && o.d(this.f21931u, gVar.f21931u) && o.d(this.f21932v, gVar.f21932v) && o.d(this.f21933w, gVar.f21933w)) {
                    return true;
                }
                return false;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer f() {
                return this.f21933w;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer g() {
                return this.f21932v;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> h() {
                return this.f21919i;
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
                int hashCode10;
                int hashCode11;
                int hashCode12 = ((((((((this.f21917g.hashCode() * 31) + this.f21918h.hashCode()) * 31) + this.f21919i.hashCode()) * 31) + this.f21920j.hashCode()) * 31) + this.f21921k.hashCode()) * 31;
                Integer num = this.f21922l;
                int i11 = 0;
                if (num == null) {
                    hashCode = 0;
                } else {
                    hashCode = num.hashCode();
                }
                int i12 = (hashCode12 + hashCode) * 31;
                String str = this.f21923m;
                if (str == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = str.hashCode();
                }
                int i13 = (i12 + hashCode2) * 31;
                Boolean bool = this.f21924n;
                if (bool == null) {
                    hashCode3 = 0;
                } else {
                    hashCode3 = bool.hashCode();
                }
                int i14 = (i13 + hashCode3) * 31;
                Integer num2 = this.f21925o;
                if (num2 == null) {
                    hashCode4 = 0;
                } else {
                    hashCode4 = num2.hashCode();
                }
                int i15 = (i14 + hashCode4) * 31;
                String str2 = this.f21926p;
                if (str2 == null) {
                    hashCode5 = 0;
                } else {
                    hashCode5 = str2.hashCode();
                }
                int i16 = (i15 + hashCode5) * 31;
                Integer num3 = this.f21927q;
                if (num3 == null) {
                    hashCode6 = 0;
                } else {
                    hashCode6 = num3.hashCode();
                }
                int i17 = (i16 + hashCode6) * 31;
                List<Integer> list = this.f21928r;
                if (list == null) {
                    hashCode7 = 0;
                } else {
                    hashCode7 = list.hashCode();
                }
                int i18 = (i17 + hashCode7) * 31;
                List<String> list2 = this.f21929s;
                if (list2 == null) {
                    hashCode8 = 0;
                } else {
                    hashCode8 = list2.hashCode();
                }
                int i19 = (i18 + hashCode8) * 31;
                Integer num4 = this.f21930t;
                if (num4 == null) {
                    hashCode9 = 0;
                } else {
                    hashCode9 = num4.hashCode();
                }
                int i21 = (i19 + hashCode9) * 31;
                String str3 = this.f21931u;
                if (str3 == null) {
                    hashCode10 = 0;
                } else {
                    hashCode10 = str3.hashCode();
                }
                int i22 = (i21 + hashCode10) * 31;
                Integer num5 = this.f21932v;
                if (num5 == null) {
                    hashCode11 = 0;
                } else {
                    hashCode11 = num5.hashCode();
                }
                int i23 = (i22 + hashCode11) * 31;
                Integer num6 = this.f21933w;
                if (num6 != null) {
                    i11 = num6.hashCode();
                }
                return i23 + i11;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer i() {
                return this.f21930t;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public CommercialItemDetailsSource j() {
                return this.f21918h;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer k() {
                return this.f21925o;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public String l() {
                return this.f21926p;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public Integer m() {
                return this.f21927q;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<Integer> n() {
                return this.f21928r;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> o() {
                return this.f21929s;
            }

            @Override // com.forsale.analytics.commercial.a.AbstractC0245a
            public List<String> p() {
                return this.f21920j;
            }

            public final String q() {
                return this.f21921k;
            }

            public String toString() {
                return "CommercialDetailsWhatsappDirected(commercialType=" + this.f21917g + ", source=" + this.f21918h + ", phoneNumbers=" + this.f21919i + ", whatsAppNumbers=" + this.f21920j + ", whatsappNumber=" + this.f21921k + ", commercialCategoryID=" + this.f21922l + ", commercialCategoryName=" + this.f21923m + ", isSourceSectionSelectedByUser=" + this.f21924n + ", sourceCarouselTotalItems=" + this.f21925o + ", sourceCategoryFullPath=" + this.f21926p + ", sourceItemOrder=" + this.f21927q + ", verticalsIDs=" + this.f21928r + ", verticalsNames=" + this.f21929s + ", positionCategoryId=" + this.f21930t + ", commercialTabName=" + this.f21931u + ", commercialWeight=" + this.f21932v + ", commercialItemId=" + this.f21933w + ')';
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AbstractC0245a(CommercialType commercialType, Integer num, String str, Boolean bool, Integer num2, Integer num3) {
            super(null);
            o.i(commercialType, "commercialType");
            this.f21814a = commercialType;
            this.f21815b = num;
            this.f21816c = str;
            this.f21817d = bool;
            this.f21818e = num2;
            this.f21819f = num3;
        }

        @Override // com.forsale.analytics.commercial.a
        public Integer a() {
            return this.f21815b;
        }

        @Override // com.forsale.analytics.commercial.a
        public String b() {
            return this.f21816c;
        }

        @Override // com.forsale.analytics.commercial.a
        public CommercialType d() {
            return this.f21814a;
        }

        @Override // com.forsale.analytics.commercial.a
        public Boolean e() {
            return this.f21817d;
        }

        public abstract Integer f();

        public Integer g() {
            return this.f21819f;
        }

        public abstract List<String> h();

        public Integer i() {
            return this.f21818e;
        }

        public abstract CommercialItemDetailsSource j();

        public abstract Integer k();

        public abstract String l();

        public abstract Integer m();

        public abstract List<Integer> n();

        public abstract List<String> o();

        public abstract List<String> p();
    }

    /* compiled from: CommercialEventsData.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        private final CommercialType f21934a;

        /* renamed from: b  reason: collision with root package name */
        private final CommercialPageSource f21935b;

        /* renamed from: c  reason: collision with root package name */
        private final int f21936c;

        /* renamed from: d  reason: collision with root package name */
        private final Boolean f21937d;

        /* renamed from: e  reason: collision with root package name */
        private final Integer f21938e;

        /* renamed from: f  reason: collision with root package name */
        private final String f21939f;

        /* renamed from: g  reason: collision with root package name */
        private final Boolean f21940g;

        /* renamed from: h  reason: collision with root package name */
        private final String f21941h;

        /* renamed from: i  reason: collision with root package name */
        private final String f21942i;

        @Override // com.forsale.analytics.commercial.a
        public Integer a() {
            return this.f21938e;
        }

        @Override // com.forsale.analytics.commercial.a
        public String b() {
            return this.f21939f;
        }

        @Override // com.forsale.analytics.commercial.a
        public String c() {
            return this.f21941h;
        }

        @Override // com.forsale.analytics.commercial.a
        public CommercialType d() {
            return this.f21934a;
        }

        @Override // com.forsale.analytics.commercial.a
        public Boolean e() {
            return this.f21940g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f21934a == bVar.f21934a && this.f21935b == bVar.f21935b && this.f21936c == bVar.f21936c && o.d(this.f21937d, bVar.f21937d) && o.d(this.f21938e, bVar.f21938e) && o.d(this.f21939f, bVar.f21939f) && o.d(this.f21940g, bVar.f21940g) && o.d(this.f21941h, bVar.f21941h) && o.d(this.f21942i, bVar.f21942i)) {
                return true;
            }
            return false;
        }

        public final Boolean f() {
            return this.f21937d;
        }

        public final CommercialPageSource g() {
            return this.f21935b;
        }

        public final int h() {
            return this.f21936c;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6 = ((((this.f21934a.hashCode() * 31) + this.f21935b.hashCode()) * 31) + Integer.hashCode(this.f21936c)) * 31;
            Boolean bool = this.f21937d;
            int i11 = 0;
            if (bool == null) {
                hashCode = 0;
            } else {
                hashCode = bool.hashCode();
            }
            int i12 = (hashCode6 + hashCode) * 31;
            Integer num = this.f21938e;
            if (num == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str = this.f21939f;
            if (str == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            Boolean bool2 = this.f21940g;
            if (bool2 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = bool2.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            String str2 = this.f21941h;
            if (str2 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str2.hashCode();
            }
            int i16 = (i15 + hashCode5) * 31;
            String str3 = this.f21942i;
            if (str3 != null) {
                i11 = str3.hashCode();
            }
            return i16 + i11;
        }

        public final String i() {
            return this.f21942i;
        }

        public String toString() {
            return "CommercialPage(commercialType=" + this.f21934a + ", source=" + this.f21935b + ", totalItemsCount=" + this.f21936c + ", homeTooltipAppeared=" + this.f21937d + ", commercialCategoryID=" + this.f21938e + ", commercialCategoryName=" + this.f21939f + ", isSourceSectionSelectedByUser=" + this.f21940g + ", commercialTabName=" + this.f21941h + ", vertical=" + this.f21942i + ')';
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Integer a();

    public abstract String b();

    public abstract String c();

    public abstract CommercialType d();

    public abstract Boolean e();
}
