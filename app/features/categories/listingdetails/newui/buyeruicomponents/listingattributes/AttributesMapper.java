package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes;

import com.forsale.app.datalayer.database.ExtraAttributeEntity;
import com.forsale.app.datalayer.network.entities.ExtraAttr;
import com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao;
import com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import com.forsale.app.utils.Languages;
import com.forsale.app.utils.TypeExtensionsKt;
import com.google.android.gms.ads.AdRequest;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AttributesMapper.kt */
/* loaded from: classes2.dex */
public final class AttributesMapper {

    /* renamed from: a  reason: collision with root package name */
    private final List<ExtraAttr> f27456a;

    /* renamed from: b  reason: collision with root package name */
    private final ExtraAttributeOptionDao f27457b;

    /* renamed from: c  reason: collision with root package name */
    private final ExtraAttributeRawRepository f27458c;

    /* compiled from: AttributesMapper.kt */
    /* loaded from: classes2.dex */
    public interface a {
        AttributesMapper a(List<ExtraAttr> list);
    }

    public AttributesMapper(List<ExtraAttr> extraAttrs, ExtraAttributeOptionDao optionDao, ExtraAttributeRawRepository extraAttributesRepository) {
        o.i(extraAttrs, "extraAttrs");
        o.i(optionDao, "optionDao");
        o.i(extraAttributesRepository, "extraAttributesRepository");
        this.f27456a = extraAttrs;
        this.f27457b = optionDao;
        this.f27458c = extraAttributesRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0154 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.forsale.app.datalayer.database.ExtraAttributeEntity r26, zz.a<? super com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper.AttributesDataModel> r27) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper.c(com.forsale.app.datalayer.database.ExtraAttributeEntity, zz.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0093 -> B:26:0x0096). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(zz.a<? super java.util.List<com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper.AttributesDataModel>> r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$1
            if (r0 == 0) goto L13
            r0 = r15
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$1 r0 = (com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$1) r0
            int r1 = r0.f27474f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f27474f = r1
            goto L18
        L13:
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$1 r0 = new com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$1
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.f27472d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.f27474f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r2 = r0.f27471c
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f27470b
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r5 = r0.f27469a
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper r5 = (com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper) r5
            kotlin.f.b(r15)
            goto L96
        L38:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L40:
            java.lang.Object r2 = r0.f27469a
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper r2 = (com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper) r2
            kotlin.f.b(r15)
            goto L6c
        L48:
            kotlin.f.b(r15)
            java.util.List<com.forsale.app.datalayer.network.entities.ExtraAttr> r15 = r14.f27456a
            r5 = r15
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$extraAttrsIds$1 r11 = new g00.l<com.forsale.app.datalayer.network.entities.ExtraAttr, java.lang.CharSequence>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$extraAttrsIds$1
                static {
                    /*
                        com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$extraAttrsIds$1 r0 = new com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$extraAttrsIds$1
                        r0.<init>()
                        
                        // error: 0x0005: SPUT  
  (r0 I:com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$extraAttrsIds$1)
 com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$extraAttrsIds$1.a com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$extraAttrsIds$1
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$extraAttrsIds$1.<clinit>():void");
                }

                {
                    /*
                        r1 = this;
                        r0 = 1
                        r1.<init>(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$extraAttrsIds$1.<init>():void");
                }

                @Override // g00.l
                /* renamed from: b */
                public final java.lang.CharSequence invoke(com.forsale.app.datalayer.network.entities.ExtraAttr r2) {
                    /*
                        r1 = this;
                        java.lang.String r0 = "it"
                        kotlin.jvm.internal.o.i(r2, r0)
                        int r2 = r2.getId()
                        java.lang.String r2 = java.lang.String.valueOf(r2)
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$extraAttrsIds$1.invoke(com.forsale.app.datalayer.network.entities.ExtraAttr):java.lang.CharSequence");
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ java.lang.CharSequence invoke(com.forsale.app.datalayer.network.entities.ExtraAttr r1) {
                    /*
                        r0 = this;
                        com.forsale.app.datalayer.network.entities.ExtraAttr r1 = (com.forsale.app.datalayer.network.entities.ExtraAttr) r1
                        java.lang.CharSequence r1 = r0.invoke(r1)
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$getAttributes$extraAttrsIds$1.invoke(java.lang.Object):java.lang.Object");
                }
            }
            r12 = 31
            r13 = 0
            java.lang.String r15 = kotlin.collections.p.t0(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            com.forsale.app.datalayer.repositories.ExtraAttributeRawRepository r2 = r14.f27458c
            r0.f27469a = r14
            r0.f27474f = r4
            java.lang.Object r15 = r2.getExtraAttributesByIds(r15, r0)
            if (r15 != r1) goto L6b
            return r1
        L6b:
            r2 = r14
        L6c:
            java.util.List r15 = (java.util.List) r15
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r15 = r15.iterator()
            r5 = r2
            r2 = r15
        L7b:
            boolean r15 = r2.hasNext()
            if (r15 == 0) goto L9e
            java.lang.Object r15 = r2.next()
            com.forsale.app.datalayer.database.ExtraAttributeEntity r15 = (com.forsale.app.datalayer.database.ExtraAttributeEntity) r15
            r0.f27469a = r5
            r0.f27470b = r4
            r0.f27471c = r2
            r0.f27474f = r3
            java.lang.Object r15 = r5.c(r15, r0)
            if (r15 != r1) goto L96
            return r1
        L96:
            com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper$AttributesDataModel r15 = (com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper.AttributesDataModel) r15
            if (r15 == 0) goto L7b
            r4.add(r15)
            goto L7b
        L9e:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper.b(zz.a):java.lang.Object");
    }

    /* compiled from: AttributesMapper.kt */
    /* loaded from: classes2.dex */
    public static final class AttributesDataModel implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        private final int f27459a;

        /* renamed from: b  reason: collision with root package name */
        private final String f27460b;

        /* renamed from: c  reason: collision with root package name */
        private final String f27461c;

        /* renamed from: d  reason: collision with root package name */
        private String f27462d;

        /* renamed from: e  reason: collision with root package name */
        private String f27463e;

        /* renamed from: f  reason: collision with root package name */
        private String f27464f;

        /* renamed from: g  reason: collision with root package name */
        private Integer f27465g;

        /* renamed from: h  reason: collision with root package name */
        private final AttributeType f27466h;

        /* renamed from: i  reason: collision with root package name */
        private final ExtraAttributeEntity.AttrUnit f27467i;

        /* renamed from: j  reason: collision with root package name */
        private final Float f27468j;

        public AttributesDataModel(int i11, String str, String str2, String str3, String str4, String str5, Integer num, AttributeType type, ExtraAttributeEntity.AttrUnit attrUnit, Float f11) {
            o.i(type, "type");
            this.f27459a = i11;
            this.f27460b = str;
            this.f27461c = str2;
            this.f27462d = str3;
            this.f27463e = str4;
            this.f27464f = str5;
            this.f27465g = num;
            this.f27466h = type;
            this.f27467i = attrUnit;
            this.f27468j = f11;
        }

        public final String a() {
            if (o.d(Languages.Companion.b().getValue(), Languages.ARABIC.getValue())) {
                String str = this.f27462d;
                String str2 = this.f27460b;
                return str + " " + str2;
            }
            String str3 = this.f27463e;
            String str4 = this.f27461c;
            return str3 + " " + str4;
        }

        public final String b() {
            if (o.d(Languages.Companion.b().getValue(), Languages.ARABIC.getValue())) {
                return String.valueOf(this.f27460b);
            }
            return String.valueOf(this.f27461c);
        }

        public final String c() {
            if (o.d(Languages.Companion.b().getValue(), Languages.ARABIC.getValue())) {
                return String.valueOf(this.f27462d);
            }
            return String.valueOf(this.f27463e);
        }

        public final Integer d() {
            return this.f27465g;
        }

        public final int e() {
            return this.f27459a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AttributesDataModel)) {
                return false;
            }
            AttributesDataModel attributesDataModel = (AttributesDataModel) obj;
            if (this.f27459a == attributesDataModel.f27459a && o.d(this.f27460b, attributesDataModel.f27460b) && o.d(this.f27461c, attributesDataModel.f27461c) && o.d(this.f27462d, attributesDataModel.f27462d) && o.d(this.f27463e, attributesDataModel.f27463e) && o.d(this.f27464f, attributesDataModel.f27464f) && o.d(this.f27465g, attributesDataModel.f27465g) && this.f27466h == attributesDataModel.f27466h && o.d(this.f27467i, attributesDataModel.f27467i) && o.d(this.f27468j, attributesDataModel.f27468j)) {
                return true;
            }
            return false;
        }

        public final String f() {
            return this.f27464f;
        }

        public final Float g() {
            return this.f27468j;
        }

        public final String h() {
            return this.f27460b;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3;
            int hashCode4;
            int hashCode5;
            int hashCode6;
            int hashCode7;
            int hashCode8 = Integer.hashCode(this.f27459a) * 31;
            String str = this.f27460b;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = (hashCode8 + hashCode) * 31;
            String str2 = this.f27461c;
            if (str2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = str2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            String str3 = this.f27462d;
            if (str3 == null) {
                hashCode3 = 0;
            } else {
                hashCode3 = str3.hashCode();
            }
            int i14 = (i13 + hashCode3) * 31;
            String str4 = this.f27463e;
            if (str4 == null) {
                hashCode4 = 0;
            } else {
                hashCode4 = str4.hashCode();
            }
            int i15 = (i14 + hashCode4) * 31;
            String str5 = this.f27464f;
            if (str5 == null) {
                hashCode5 = 0;
            } else {
                hashCode5 = str5.hashCode();
            }
            int i16 = (i15 + hashCode5) * 31;
            Integer num = this.f27465g;
            if (num == null) {
                hashCode6 = 0;
            } else {
                hashCode6 = num.hashCode();
            }
            int hashCode9 = (((i16 + hashCode6) * 31) + this.f27466h.hashCode()) * 31;
            ExtraAttributeEntity.AttrUnit attrUnit = this.f27467i;
            if (attrUnit == null) {
                hashCode7 = 0;
            } else {
                hashCode7 = attrUnit.hashCode();
            }
            int i17 = (hashCode9 + hashCode7) * 31;
            Float f11 = this.f27468j;
            if (f11 != null) {
                i11 = f11.hashCode();
            }
            return i17 + i11;
        }

        public final String i() {
            return this.f27461c;
        }

        public final AttributeType j() {
            return this.f27466h;
        }

        public final String k(boolean z11) {
            Float f11;
            String str;
            ExtraAttributeEntity.LocalUnit en2;
            String str2;
            ExtraAttributeEntity.LocalUnit ar2;
            String str3;
            ExtraAttributeEntity.LocalUnit en3;
            String str4;
            ExtraAttributeEntity.LocalUnit ar3;
            String str5;
            ExtraAttributeEntity.LocalUnit en4;
            String str6;
            ExtraAttributeEntity.LocalUnit ar4;
            String str7 = this.f27463e;
            String str8 = null;
            if (str7 != null) {
                f11 = Float.valueOf(Float.parseFloat(str7));
            } else {
                f11 = null;
            }
            if (o.b(f11, 1.0f)) {
                if (z11) {
                    String str9 = this.f27462d;
                    if (str9 != null) {
                        str8 = TypeExtensionsKt.U(Float.parseFloat(str9));
                    }
                    ExtraAttributeEntity.AttrUnit attrUnit = this.f27467i;
                    if (attrUnit == null || (ar4 = attrUnit.getAr()) == null || (str6 = ar4.getSingular()) == null) {
                        str6 = new String();
                    }
                    return str8 + " " + str6;
                }
                String str10 = this.f27463e;
                ExtraAttributeEntity.AttrUnit attrUnit2 = this.f27467i;
                if (attrUnit2 == null || (en4 = attrUnit2.getEn()) == null || (str5 = en4.getSingular()) == null) {
                    str5 = new String();
                }
                return str10 + " " + str5;
            } else if (o.b(f11, 2.0f)) {
                if (z11) {
                    String str11 = this.f27462d;
                    if (str11 != null) {
                        str8 = TypeExtensionsKt.U(Float.parseFloat(str11));
                    }
                    ExtraAttributeEntity.AttrUnit attrUnit3 = this.f27467i;
                    if (attrUnit3 == null || (ar3 = attrUnit3.getAr()) == null || (str4 = ar3.getDual()) == null) {
                        str4 = new String();
                    }
                    return str8 + " " + str4;
                }
                String str12 = this.f27463e;
                ExtraAttributeEntity.AttrUnit attrUnit4 = this.f27467i;
                if (attrUnit4 == null || (en3 = attrUnit4.getEn()) == null || (str3 = en3.getDual()) == null) {
                    str3 = new String();
                }
                return str12 + " " + str3;
            } else if (z11) {
                x10.a.b("getUnitStringValueLocalized:: " + this.f27462d, new Object[0]);
                String str13 = this.f27462d;
                if (str13 != null) {
                    str8 = TypeExtensionsKt.U(Float.parseFloat(str13));
                }
                ExtraAttributeEntity.AttrUnit attrUnit5 = this.f27467i;
                if (attrUnit5 == null || (ar2 = attrUnit5.getAr()) == null || (str2 = ar2.getPlural()) == null) {
                    str2 = new String();
                }
                return str8 + " " + str2;
            } else {
                String str14 = this.f27463e;
                ExtraAttributeEntity.AttrUnit attrUnit6 = this.f27467i;
                if (attrUnit6 == null || (en2 = attrUnit6.getEn()) == null || (str = en2.getPlural()) == null) {
                    str = new String();
                }
                return str14 + " " + str;
            }
        }

        public final String l() {
            return this.f27462d;
        }

        public final String m() {
            return this.f27463e;
        }

        public final void n(Integer num) {
            this.f27465g = num;
        }

        public final void o(String str) {
            this.f27462d = str;
        }

        public final void p(String str) {
            this.f27463e = str;
        }

        public String toString() {
            int i11 = this.f27459a;
            String str = this.f27460b;
            String str2 = this.f27461c;
            String str3 = this.f27462d;
            String str4 = this.f27463e;
            String str5 = this.f27464f;
            Integer num = this.f27465g;
            AttributeType attributeType = this.f27466h;
            ExtraAttributeEntity.AttrUnit attrUnit = this.f27467i;
            Float f11 = this.f27468j;
            return "AttributesDataModel(id=" + i11 + ", titleAr=" + str + ", titleEn=" + str2 + ", valueAr=" + str3 + ", valueEn=" + str4 + ", image=" + str5 + ", displayOrder=" + num + ", type=" + attributeType + ", unit=" + attrUnit + ", size=" + f11 + ")";
        }

        public /* synthetic */ AttributesDataModel(int i11, String str, String str2, String str3, String str4, String str5, Integer num, AttributeType attributeType, ExtraAttributeEntity.AttrUnit attrUnit, Float f11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(i11, str, str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : str4, str5, num, attributeType, (i12 & 256) != 0 ? null : attrUnit, (i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? null : f11);
        }
    }
}
