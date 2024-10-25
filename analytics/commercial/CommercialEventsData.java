package com.forsale.analytics.commercial;

import com.forsale.analytics.commercial.a;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.collections.i0;
import kotlin.collections.j0;
import kotlin.jvm.internal.o;
import s9.a;
import wz.i;
/* compiled from: CommercialEventsData.kt */
/* loaded from: classes2.dex */
public final class CommercialEventsData {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommercialEventsData.kt */
    /* loaded from: classes2.dex */
    public static final class CommercialAttribute {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ CommercialAttribute[] $VALUES;
        private final String value;
        public static final CommercialAttribute COMMERCIAL_CATEGORY_ID = new CommercialAttribute("COMMERCIAL_CATEGORY_ID", 0, "CommercialCategoryID");
        public static final CommercialAttribute COMMERCIAL_CATEGORY_NAME = new CommercialAttribute("COMMERCIAL_CATEGORY_NAME", 1, "CommercialCategoryName");
        public static final CommercialAttribute COMMERCIAL_TYPE = new CommercialAttribute("COMMERCIAL_TYPE", 2, "CommercialType");
        public static final CommercialAttribute IS_SOURCE_SECTION_SELECTED_BY_USER = new CommercialAttribute("IS_SOURCE_SECTION_SELECTED_BY_USER", 3, "IsSourceSectionSelectedByUser");
        public static final CommercialAttribute TOTAL_ITEMS_COUNT = new CommercialAttribute("TOTAL_ITEMS_COUNT", 4, "TotalItemsCount");
        public static final CommercialAttribute VERTICAL = new CommercialAttribute("VERTICAL", 5, "Vertical");
        public static final CommercialAttribute PHONE_NUMBERS = new CommercialAttribute("PHONE_NUMBERS", 6, "PhoneNumbers");
        public static final CommercialAttribute WHATSAPP_NUMBERS = new CommercialAttribute("WHATSAPP_NUMBERS", 7, "WhatsAppNumbers");
        public static final CommercialAttribute SOURCE = new CommercialAttribute("SOURCE", 8, "Source");
        public static final CommercialAttribute SOURCE_TOTAL_ITEMS_COUNT = new CommercialAttribute("SOURCE_TOTAL_ITEMS_COUNT", 9, "SourceTotalItemsCount");
        public static final CommercialAttribute SOURCE_CATEGORY_FULL_PATH = new CommercialAttribute("SOURCE_CATEGORY_FULL_PATH", 10, "SourceCategoryFullPath");
        public static final CommercialAttribute SOURCE_ITEM_ORDER = new CommercialAttribute("SOURCE_ITEM_ORDER", 11, "SourceItemOrder");
        public static final CommercialAttribute COMMERCIAL_TAB_NAME = new CommercialAttribute("COMMERCIAL_TAB_NAME", 12, "CommercialTabName");
        public static final CommercialAttribute VERTICALS_IDS = new CommercialAttribute("VERTICALS_IDS", 13, "VerticalsIDs");
        public static final CommercialAttribute VERTICALS_NAMES = new CommercialAttribute("VERTICALS_NAMES", 14, "VerticalsNames");
        public static final CommercialAttribute PHONE_NUMBER = new CommercialAttribute("PHONE_NUMBER", 15, "PhoneNumber");
        public static final CommercialAttribute WHATSAPP_NUMBER = new CommercialAttribute("WHATSAPP_NUMBER", 16, "WhatsAppNumber");
        public static final CommercialAttribute HOME_TOOLTIP_APPEARED = new CommercialAttribute("HOME_TOOLTIP_APPEARED", 17, "HomeTooltipAppeared");
        public static final CommercialAttribute COMMERCIAL_WEIGHT = new CommercialAttribute("COMMERCIAL_WEIGHT", 18, "CommercialWeight");
        public static final CommercialAttribute COMMERCIAL_ITEM_ID = new CommercialAttribute("COMMERCIAL_ITEM_ID", 19, "CommercialItemID");

        private static final /* synthetic */ CommercialAttribute[] $values() {
            return new CommercialAttribute[]{COMMERCIAL_CATEGORY_ID, COMMERCIAL_CATEGORY_NAME, COMMERCIAL_TYPE, IS_SOURCE_SECTION_SELECTED_BY_USER, TOTAL_ITEMS_COUNT, VERTICAL, PHONE_NUMBERS, WHATSAPP_NUMBERS, SOURCE, SOURCE_TOTAL_ITEMS_COUNT, SOURCE_CATEGORY_FULL_PATH, SOURCE_ITEM_ORDER, COMMERCIAL_TAB_NAME, VERTICALS_IDS, VERTICALS_NAMES, PHONE_NUMBER, WHATSAPP_NUMBER, HOME_TOOLTIP_APPEARED, COMMERCIAL_WEIGHT, COMMERCIAL_ITEM_ID};
        }

        static {
            CommercialAttribute[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CommercialAttribute(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<CommercialAttribute> getEntries() {
            return $ENTRIES;
        }

        public static CommercialAttribute valueOf(String str) {
            return (CommercialAttribute) Enum.valueOf(CommercialAttribute.class, str);
        }

        public static CommercialAttribute[] values() {
            return (CommercialAttribute[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CommercialEventsData.kt */
    /* loaded from: classes2.dex */
    public static final class CommercialEvent {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ CommercialEvent[] $VALUES;
        private final String value;
        public static final CommercialEvent COMMERCIAL_PAGE_VISITED = new CommercialEvent("COMMERCIAL_PAGE_VISITED", 0, "Commercial Page Visited");
        public static final CommercialEvent COMMERCIAL_ITEM_DETAILS_VISITED = new CommercialEvent("COMMERCIAL_ITEM_DETAILS_VISITED", 1, "Commercial Item Details Visited");
        public static final CommercialEvent COMMERCIAL_ITEM_DETAILS_CLOSE_CLICKED = new CommercialEvent("COMMERCIAL_ITEM_DETAILS_CLOSE_CLICKED", 2, "Commercial Item Details Close Clicked");
        public static final CommercialEvent COMMERCIAL_ITEM_DETAILS_PHONE_ICON_CLICKED = new CommercialEvent("COMMERCIAL_ITEM_DETAILS_PHONE_ICON_CLICKED", 3, "Commercial Item Details Phone Icon Clicked");
        public static final CommercialEvent COMMERCIAL_ITEM_DETAILS_PHONE_CLICKED = new CommercialEvent("COMMERCIAL_ITEM_DETAILS_PHONE_CLICKED", 4, "Commercial Item Details Phone Clicked");
        public static final CommercialEvent COMMERCIAL_ITEM_DETAILS_SHARE_CLICKED = new CommercialEvent("COMMERCIAL_ITEM_DETAILS_SHARE_CLICKED", 5, "Commercial Item Details Share Clicked");
        public static final CommercialEvent COMMERCIAL_ITEM_DETAILS_WHATSAPP_DIRECTED = new CommercialEvent("COMMERCIAL_ITEM_DETAILS_WHATSAPP_DIRECTED", 6, "Commercial Item Details Whatsapp Directed");
        public static final CommercialEvent COMMERCIAL_ITEM_DETAILS_DOWNLOAD_CLICKED = new CommercialEvent("COMMERCIAL_ITEM_DETAILS_DOWNLOAD_CLICKED", 7, "Commercial Item Details Download Clicked");

        private static final /* synthetic */ CommercialEvent[] $values() {
            return new CommercialEvent[]{COMMERCIAL_PAGE_VISITED, COMMERCIAL_ITEM_DETAILS_VISITED, COMMERCIAL_ITEM_DETAILS_CLOSE_CLICKED, COMMERCIAL_ITEM_DETAILS_PHONE_ICON_CLICKED, COMMERCIAL_ITEM_DETAILS_PHONE_CLICKED, COMMERCIAL_ITEM_DETAILS_SHARE_CLICKED, COMMERCIAL_ITEM_DETAILS_WHATSAPP_DIRECTED, COMMERCIAL_ITEM_DETAILS_DOWNLOAD_CLICKED};
        }

        static {
            CommercialEvent[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private CommercialEvent(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a00.a<CommercialEvent> getEntries() {
            return $ENTRIES;
        }

        public static CommercialEvent valueOf(String str) {
            return (CommercialEvent) Enum.valueOf(CommercialEvent.class, str);
        }

        public static CommercialEvent[] values() {
            return (CommercialEvent[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }
    }

    private final a.C0811a a(a.AbstractC0245a.C0246a c0246a) {
        Map h11;
        Map o11;
        h11 = j0.h();
        o11 = j0.o(h11, j(c0246a));
        return new a.C0811a(CommercialEvent.COMMERCIAL_ITEM_DETAILS_CLOSE_CLICKED.getValue(), o11, true, true, false, c0246a.i());
    }

    private final a.C0811a b(a.AbstractC0245a.b bVar) {
        Map h11;
        Map o11;
        h11 = j0.h();
        o11 = j0.o(h11, j(bVar));
        return new a.C0811a(CommercialEvent.COMMERCIAL_ITEM_DETAILS_DOWNLOAD_CLICKED.getValue(), o11, true, true, false, bVar.i());
    }

    private final a.C0811a c(a.AbstractC0245a.c cVar) {
        Map h11;
        Map o11;
        Map p11;
        h11 = j0.h();
        o11 = j0.o(h11, j(cVar));
        p11 = j0.p(o11, i.a(CommercialAttribute.PHONE_NUMBER.getValue(), cVar.q()));
        return new a.C0811a(CommercialEvent.COMMERCIAL_ITEM_DETAILS_PHONE_CLICKED.getValue(), p11, true, true, false, cVar.i());
    }

    private final a.C0811a d(a.AbstractC0245a.d dVar) {
        Map h11;
        Map o11;
        h11 = j0.h();
        o11 = j0.o(h11, j(dVar));
        return new a.C0811a(CommercialEvent.COMMERCIAL_ITEM_DETAILS_PHONE_ICON_CLICKED.getValue(), o11, true, true, false, dVar.i());
    }

    private final a.C0811a e(a.AbstractC0245a.e eVar) {
        Map h11;
        Map o11;
        h11 = j0.h();
        o11 = j0.o(h11, j(eVar));
        return new a.C0811a(CommercialEvent.COMMERCIAL_ITEM_DETAILS_SHARE_CLICKED.getValue(), o11, true, true, false, eVar.i());
    }

    private final a.C0811a f(a.AbstractC0245a.f fVar) {
        Map h11;
        Map o11;
        h11 = j0.h();
        o11 = j0.o(h11, j(fVar));
        return new a.C0811a(CommercialEvent.COMMERCIAL_ITEM_DETAILS_VISITED.getValue(), o11, true, true, false, fVar.i());
    }

    private final a.C0811a g(a.AbstractC0245a.g gVar) {
        Map h11;
        Map o11;
        Map p11;
        h11 = j0.h();
        o11 = j0.o(h11, j(gVar));
        p11 = j0.p(o11, i.a(CommercialAttribute.WHATSAPP_NUMBER.getValue(), gVar.q()));
        return new a.C0811a(CommercialEvent.COMMERCIAL_ITEM_DETAILS_WHATSAPP_DIRECTED.getValue(), p11, true, true, false, gVar.i());
    }

    private final a.C0811a h(a.b bVar) {
        Map h11;
        Map o11;
        Map f11;
        Map o12;
        Map o13;
        Map f12;
        Map o14;
        Map o15;
        h11 = j0.h();
        o11 = j0.o(h11, i(bVar));
        f11 = i0.f(i.a(CommercialAttribute.SOURCE.getValue(), bVar.g().getValue()));
        o12 = j0.o(o11, f11);
        o13 = j0.o(o12, bVar.f() != null ? i0.f(i.a(CommercialAttribute.HOME_TOOLTIP_APPEARED.getValue(), bVar.f())) : j0.h());
        f12 = i0.f(i.a(CommercialAttribute.TOTAL_ITEMS_COUNT.getValue(), Integer.valueOf(bVar.h())));
        o14 = j0.o(o13, f12);
        o15 = j0.o(o14, bVar.i() != null ? i0.f(i.a(CommercialAttribute.VERTICAL.getValue(), bVar.i())) : j0.h());
        return new a.C0811a(CommercialEvent.COMMERCIAL_PAGE_VISITED.getValue(), o15, true, true, false, null, 32, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x007e, code lost:
        if (r1 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008e, code lost:
        r4 = kotlin.collections.i0.f(wz.i.a(com.forsale.analytics.commercial.CommercialEventsData.CommercialAttribute.COMMERCIAL_TAB_NAME.getValue(), r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x003a, code lost:
        if (r1 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004a, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.analytics.commercial.CommercialEventsData.CommercialAttribute.COMMERCIAL_CATEGORY_NAME.getValue(), r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map<java.lang.String, java.lang.Object> i(com.forsale.analytics.commercial.a r4) {
        /*
            r3 = this;
            java.util.Map r0 = kotlin.collections.g0.h()
            com.forsale.analytics.commercial.CommercialEventsData$CommercialAttribute r1 = com.forsale.analytics.commercial.CommercialEventsData.CommercialAttribute.COMMERCIAL_TYPE
            java.lang.String r1 = r1.getValue()
            com.forsale.analytics.commercial.CommercialType r2 = r4.d()
            java.lang.String r2 = r2.getValue()
            kotlin.Pair r1 = wz.i.a(r1, r2)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            java.lang.Integer r1 = r4.a()
            if (r1 == 0) goto L3c
            int r1 = r1.intValue()
            com.forsale.analytics.commercial.CommercialEventsData$CommercialAttribute r2 = com.forsale.analytics.commercial.CommercialEventsData.CommercialAttribute.COMMERCIAL_CATEGORY_ID
            java.lang.String r2 = r2.getValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            kotlin.Pair r1 = wz.i.a(r2, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L40
        L3c:
            java.util.Map r1 = kotlin.collections.g0.h()
        L40:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            java.lang.String r1 = r4.b()
            if (r1 == 0) goto L5a
            com.forsale.analytics.commercial.CommercialEventsData$CommercialAttribute r2 = com.forsale.analytics.commercial.CommercialEventsData.CommercialAttribute.COMMERCIAL_CATEGORY_NAME
            java.lang.String r2 = r2.getValue()
            kotlin.Pair r1 = wz.i.a(r2, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L5e
        L5a:
            java.util.Map r1 = kotlin.collections.g0.h()
        L5e:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            java.lang.Boolean r1 = r4.e()
            if (r1 == 0) goto L80
            boolean r1 = r1.booleanValue()
            com.forsale.analytics.commercial.CommercialEventsData$CommercialAttribute r2 = com.forsale.analytics.commercial.CommercialEventsData.CommercialAttribute.IS_SOURCE_SECTION_SELECTED_BY_USER
            java.lang.String r2 = r2.getValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            kotlin.Pair r1 = wz.i.a(r2, r1)
            java.util.Map r1 = kotlin.collections.g0.f(r1)
            if (r1 != 0) goto L84
        L80:
            java.util.Map r1 = kotlin.collections.g0.h()
        L84:
            java.util.Map r0 = kotlin.collections.g0.o(r0, r1)
            java.lang.String r4 = r4.c()
            if (r4 == 0) goto L9e
            com.forsale.analytics.commercial.CommercialEventsData$CommercialAttribute r1 = com.forsale.analytics.commercial.CommercialEventsData.CommercialAttribute.COMMERCIAL_TAB_NAME
            java.lang.String r1 = r1.getValue()
            kotlin.Pair r4 = wz.i.a(r1, r4)
            java.util.Map r4 = kotlin.collections.g0.f(r4)
            if (r4 != 0) goto La2
        L9e:
            java.util.Map r4 = kotlin.collections.g0.h()
        La2:
            java.util.Map r4 = kotlin.collections.g0.o(r0, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.analytics.commercial.CommercialEventsData.i(com.forsale.analytics.commercial.a):java.util.Map");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b2, code lost:
        if (r1 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00c2, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.analytics.commercial.CommercialEventsData.CommercialAttribute.VERTICALS_IDS.getValue(), r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e0, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.analytics.commercial.CommercialEventsData.CommercialAttribute.VERTICALS_NAMES.getValue(), r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0123, code lost:
        if (r1 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0149, code lost:
        if (r4 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x006e, code lost:
        if (r1 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x007e, code lost:
        r1 = kotlin.collections.i0.f(wz.i.a(com.forsale.analytics.commercial.CommercialEventsData.CommercialAttribute.SOURCE_CATEGORY_FULL_PATH.getValue(), r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Map<java.lang.String, java.lang.Object> j(com.forsale.analytics.commercial.a.AbstractC0245a r4) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.analytics.commercial.CommercialEventsData.j(com.forsale.analytics.commercial.a$a):java.util.Map");
    }

    public final a.C0811a k(a attributes) {
        o.i(attributes, "attributes");
        if (attributes instanceof a.b) {
            return h((a.b) attributes);
        }
        if (attributes instanceof a.AbstractC0245a.f) {
            return f((a.AbstractC0245a.f) attributes);
        }
        if (attributes instanceof a.AbstractC0245a.C0246a) {
            return a((a.AbstractC0245a.C0246a) attributes);
        }
        if (attributes instanceof a.AbstractC0245a.e) {
            return e((a.AbstractC0245a.e) attributes);
        }
        if (attributes instanceof a.AbstractC0245a.d) {
            return d((a.AbstractC0245a.d) attributes);
        }
        if (attributes instanceof a.AbstractC0245a.c) {
            return c((a.AbstractC0245a.c) attributes);
        }
        if (attributes instanceof a.AbstractC0245a.g) {
            return g((a.AbstractC0245a.g) attributes);
        }
        if (attributes instanceof a.AbstractC0245a.b) {
            return b((a.AbstractC0245a.b) attributes);
        }
        if (attributes instanceof a.AbstractC0245a) {
            throw new NotImplementedError(null, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}
