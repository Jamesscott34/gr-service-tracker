package com.jamesscott.servicetracker;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import java.util.ArrayList;

public class DBHandler extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "MyDatabase.db";

    // Table creation SQL statements for Contract Customers
    private static final String SQL_CREATE_CONTRACT_CUSTOMERS_TABLE =
            "CREATE TABLE IF NOT EXISTS " + ContractCustomersContract.CustomerEntry.TABLE_NAME + " (" +
                    ContractCustomersContract.CustomerEntry._ID + " INTEGER PRIMARY KEY," +
                    ContractCustomersContract.CustomerEntry.COLUMN_NAME + " TEXT," +
                    ContractCustomersContract.CustomerEntry.COLUMN_ADDRESS + " TEXT," +
                    ContractCustomersContract.CustomerEntry.COLUMN_PHONE + " TEXT," +
                    ContractCustomersContract.CustomerEntry.COLUMN_EMAIL + " TEXT," +
                    ContractCustomersContract.CustomerEntry.COLUMN_COMPANY + " TEXT," +
                    ContractCustomersContract.CustomerEntry.COLUMN_VISIT + " TEXT," +
                    ContractCustomersContract.CustomerEntry.COLUMN_PRICE_PER_QUARTER + " REAL)";

    // Table creation SQL statements for Contract Customers Reports
    private static final String SQL_CREATE_CONTRACT_CUSTOMERS_REPORTS_TABLE =
            "CREATE TABLE IF NOT EXISTS " + ContractCustomersContract.ReportsEntry.TABLE_NAME + " (" +
                    ContractCustomersContract.ReportsEntry._ID + " INTEGER PRIMARY KEY," +
                    ContractCustomersContract.ReportsEntry.COLUMN_CUSTOMER_ID + " INTEGER," +
                    ContractCustomersContract.ReportsEntry.COLUMN_VISIT_PURPOSE + " TEXT," +
                    ContractCustomersContract.ReportsEntry.COLUMN_DATE + " TEXT," +
                    ContractCustomersContract.ReportsEntry.COLUMN_FINDING + " TEXT," +
                    ContractCustomersContract.ReportsEntry.COLUMN_RECOMMENDATION + " TEXT," +
                    ContractCustomersContract.ReportsEntry.COLUMN_FOLLOW_UP + " TEXT," +
                    ContractCustomersContract.ReportsEntry.COLUMN_MATERIALS + " TEXT," +
                    ContractCustomersContract.ReportsEntry.COLUMN_SIGN + " TEXT," +
                    "FOREIGN KEY (" + ContractCustomersContract.ReportsEntry.COLUMN_CUSTOMER_ID + ") REFERENCES " +
                    ContractCustomersContract.CustomerEntry.TABLE_NAME + "(" + ContractCustomersContract.CustomerEntry._ID + "))";

    // Table creation SQL statements for Jobs Customers
    private static final String SQL_CREATE_JOBS_CUSTOMERS_TABLE =
            "CREATE TABLE IF NOT EXISTS " + JobsCustomersContract.CustomerEntry.TABLE_NAME + " (" +
                    JobsCustomersContract.CustomerEntry._ID + " INTEGER PRIMARY KEY," +
                    JobsCustomersContract.CustomerEntry.COLUMN_NAME + " TEXT," +
                    JobsCustomersContract.CustomerEntry.COLUMN_ADDRESS + " TEXT," +
                    JobsCustomersContract.CustomerEntry.COLUMN_PHONE + " TEXT," +
                    JobsCustomersContract.CustomerEntry.COLUMN_EMAIL + " TEXT," +
                    JobsCustomersContract.CustomerEntry.COLUMN_VISIT_REASON + " TEXT," +
                    JobsCustomersContract.CustomerEntry.COLUMN_PRICE + " REAL)";

    // Table creation SQL statements for Jobs Customers Reports
    private static final String SQL_CREATE_JOBS_CUSTOMERS_REPORTS_TABLE =
            "CREATE TABLE IF NOT EXISTS " + JobsCustomersContract.ReportsEntry.TABLE_NAME + " (" +
                    JobsCustomersContract.ReportsEntry._ID + " INTEGER PRIMARY KEY," +
                    JobsCustomersContract.ReportsEntry.COLUMN_CUSTOMER_NAME + " TEXT," +
                    JobsCustomersContract.ReportsEntry.COLUMN_VISIT_PURPOSE + " TEXT," +
                    JobsCustomersContract.ReportsEntry.COLUMN_DATE + " TEXT," +
                    JobsCustomersContract.ReportsEntry.COLUMN_FINDING + " TEXT," +
                    JobsCustomersContract.ReportsEntry.COLUMN_RECOMMENDATION + " TEXT," +
                    JobsCustomersContract.ReportsEntry.COLUMN_FOLLOW_UP + " TEXT," +
                    JobsCustomersContract.ReportsEntry.COLUMN_MATERIALS + " TEXT," +
                    JobsCustomersContract.ReportsEntry.COLUMN_SIGN + " TEXT," +
                    "FOREIGN KEY (" + JobsCustomersContract.ReportsEntry.COLUMN_CUSTOMER_NAME + ") REFERENCES " +
                    JobsCustomersContract.CustomerEntry.TABLE_NAME + "(" + JobsCustomersContract.CustomerEntry.COLUMN_NAME + "))";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_CONTRACT_CUSTOMERS_TABLE);
        db.execSQL(SQL_CREATE_CONTRACT_CUSTOMERS_REPORTS_TABLE);
        db.execSQL(SQL_CREATE_JOBS_CUSTOMERS_TABLE);
        db.execSQL(SQL_CREATE_JOBS_CUSTOMERS_REPORTS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + ContractCustomersContract.CustomerEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + ContractCustomersContract.ReportsEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + JobsCustomersContract.CustomerEntry.TABLE_NAME);
        db.execSQL("DROP TABLE IF EXISTS " + JobsCustomersContract.ReportsEntry.TABLE_NAME);
        onCreate(db);
    }


    public long insertContractCustomer(String name, String address, String phone, String email,
                                       String company, String visit, double pricePerQuarter) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ContractCustomersContract.CustomerEntry.COLUMN_NAME, name);
        values.put(ContractCustomersContract.CustomerEntry.COLUMN_ADDRESS, address);
        values.put(ContractCustomersContract.CustomerEntry.COLUMN_PHONE, phone);
        values.put(ContractCustomersContract.CustomerEntry.COLUMN_EMAIL, email);
        values.put(ContractCustomersContract.CustomerEntry.COLUMN_COMPANY, company);
        values.put(ContractCustomersContract.CustomerEntry.COLUMN_VISIT, visit);
        values.put(ContractCustomersContract.CustomerEntry.COLUMN_PRICE_PER_QUARTER, pricePerQuarter);
        return db.insert(ContractCustomersContract.CustomerEntry.TABLE_NAME, null, values);
    }

    public long insertContractCustomerReport(long customerId, String visitPurpose, String date,
                                             String finding, String recommendation, String followUp,
                                             String materials, String sign) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ContractCustomersContract.ReportsEntry.COLUMN_CUSTOMER_ID, customerId);
        values.put(ContractCustomersContract.ReportsEntry.COLUMN_VISIT_PURPOSE, visitPurpose);
        values.put(ContractCustomersContract.ReportsEntry.COLUMN_DATE, date);
        values.put(ContractCustomersContract.ReportsEntry.COLUMN_FINDING, finding);
        values.put(ContractCustomersContract.ReportsEntry.COLUMN_RECOMMENDATION, recommendation);
        values.put(ContractCustomersContract.ReportsEntry.COLUMN_FOLLOW_UP, followUp);
        values.put(ContractCustomersContract.ReportsEntry.COLUMN_MATERIALS, materials);
        values.put(ContractCustomersContract.ReportsEntry.COLUMN_SIGN, sign);
        return db.insert(ContractCustomersContract.ReportsEntry.TABLE_NAME, null, values);
    }

    public long insertJobsCustomer(String name, String address, String phone, String email,
                                   String visitReason, double price) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(JobsCustomersContract.CustomerEntry.COLUMN_NAME, name);
        values.put(JobsCustomersContract.CustomerEntry.COLUMN_ADDRESS, address);
        values.put(JobsCustomersContract.CustomerEntry.COLUMN_PHONE, phone);
        values.put(JobsCustomersContract.CustomerEntry.COLUMN_EMAIL, email);
        values.put(JobsCustomersContract.CustomerEntry.COLUMN_VISIT_REASON, visitReason);
        values.put(JobsCustomersContract.CustomerEntry.COLUMN_PRICE, price);
        return db.insert(JobsCustomersContract.CustomerEntry.TABLE_NAME, null, values);
    }

    public long insertJobsCustomerReport(String customerName, String visitPurpose, String date,
                                         String finding, String recommendation, String followUp,
                                         String materials, String sign) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(JobsCustomersContract.ReportsEntry.COLUMN_CUSTOMER_NAME, customerName);
        values.put(JobsCustomersContract.ReportsEntry.COLUMN_VISIT_PURPOSE, visitPurpose);
        values.put(JobsCustomersContract.ReportsEntry.COLUMN_DATE, date);
        values.put(JobsCustomersContract.ReportsEntry.COLUMN_FINDING, finding);
        values.put(JobsCustomersContract.ReportsEntry.COLUMN_RECOMMENDATION, recommendation);
        values.put(JobsCustomersContract.ReportsEntry.COLUMN_FOLLOW_UP, followUp);
        values.put(JobsCustomersContract.ReportsEntry.COLUMN_MATERIALS, materials);
        values.put(JobsCustomersContract.ReportsEntry.COLUMN_SIGN, sign);
        return db.insert(JobsCustomersContract.ReportsEntry.TABLE_NAME, null, values);
    }

    public long getCustomerIdByName(String customerName) {
        SQLiteDatabase db = this.getReadableDatabase();
        long customerId = -1; // Default value if customer is not found

        // Define the columns you want to retrieve
        String[] projection = {ContractCustomersContract.CustomerEntry._ID};
        // Define the selection criteria
        String selection = ContractCustomersContract.CustomerEntry.COLUMN_NAME + " = ?";
        // Define the selection arguments
        String[] selectionArgs = {customerName};

        // Query the database to retrieve the customer ID
        Cursor cursor = db.query(
                ContractCustomersContract.CustomerEntry.TABLE_NAME,  // The table to query
                projection,                     // The columns to return
                selection,                      // The columns for the WHERE clause
                selectionArgs,                  // The values for the WHERE clause
                null,                           // Don't group the rows
                null,                           // Don't filter by row groups
                null                            // The sort order
        );

        // Check if the cursor returned any rows
        if (cursor != null && cursor.moveToFirst()) {
            // Retrieve the customer ID from the cursor
            customerId = ((Cursor) cursor).getLong(cursor.getColumnIndexOrThrow(ContractCustomersContract.CustomerEntry._ID));
            cursor.close(); // Close the cursor to release its resources
        }

        return customerId;
    }

    public ArrayList<String> getAllContractCustomers() {
        ArrayList<String> customersList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        // Define the columns you want to retrieve
        String[] projection = {ContractCustomersContract.CustomerEntry.COLUMN_NAME};

        // Query the database to retrieve all contract customers
        Cursor cursor = db.query(
                ContractCustomersContract.CustomerEntry.TABLE_NAME,  // The table to query
                projection,                     // The columns to return
                null,                           // The columns for the WHERE clause
                null,                           // The values for the WHERE clause
                null,                           // Don't group the rows
                null,                           // Don't filter by row groups
                null                            // The sort order
        );

        // Add contract customers to the list
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String customerName = cursor.getString(cursor.getColumnIndexOrThrow(ContractCustomersContract.CustomerEntry.COLUMN_NAME));
                customersList.add(customerName);
            }
            cursor.close(); // Close the cursor to release its resources
        }

        return customersList;
    }

    public ArrayList<String> getAllJobCustomers() {
        ArrayList<String> customersList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        // Define the columns you want to retrieve
        String[] projection = {JobsCustomersContract.CustomerEntry.COLUMN_NAME};

        // Query the database to retrieve all job customers
        Cursor cursor = db.query(
                JobsCustomersContract.CustomerEntry.TABLE_NAME,  // The table to query
                projection,                     // The columns to return
                null,                           // The columns for the WHERE clause
                null,                           // The values for the WHERE clause
                null,                           // Don't group the rows
                null,                           // Don't filter by row groups
                null                            // The sort order
        );

        // Add job customers to the list
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String customerName = cursor.getString(cursor.getColumnIndexOrThrow(JobsCustomersContract.CustomerEntry.COLUMN_NAME));
                customersList.add(customerName);
            }
            cursor.close(); // Close the cursor to release its resources
        }

        return customersList;
    }

    public ArrayList<String> getAllContracts() {
        ArrayList<String> contractsList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        // Define the columns you want to retrieve
        String[] projection = {ContractCustomersContract.CustomerEntry.COLUMN_NAME};

        // Query the database to retrieve all contracts
        Cursor cursor = db.query(
                ContractCustomersContract.CustomerEntry.TABLE_NAME,  // The table to query
                projection,                     // The columns to return
                null,                           // The columns for the WHERE clause
                null,                           // The values for the WHERE clause
                null,                           // Don't group the rows
                null,                           // Don't filter by row groups
                null                            // The sort order
        );

        // Add contracts to the list
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String contractName = cursor.getString(cursor.getColumnIndexOrThrow(ContractCustomersContract.CustomerEntry.COLUMN_NAME));
                contractsList.add(contractName);
            }
            cursor.close(); // Close the cursor to release its resources
        }

        return contractsList;
    }

    public ArrayList<String> getAllJobs() {
        ArrayList<String> jobsList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        // Define the columns you want to retrieve
        String[] projection = {JobsCustomersContract.CustomerEntry.COLUMN_NAME};

        // Query the database to retrieve all jobs
        Cursor cursor = db.query(
                JobsCustomersContract.CustomerEntry.TABLE_NAME,  // The table to query
                projection,                     // The columns to return
                null,                           // The columns for the WHERE clause
                null,                           // The values for the WHERE clause
                null,                           // Don't group the rows
                null,                           // Don't filter by row groups
                null                            // The sort order
        );

        // Add jobs to the list
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String jobName = cursor.getString(cursor.getColumnIndexOrThrow(JobsCustomersContract.CustomerEntry.COLUMN_NAME));
                jobsList.add(jobName);
            }
            cursor.close(); // Close the cursor to release its resources
        }

        return jobsList;
    }

    public ArrayList<String> getAllReports() {
        ArrayList<String> reportsList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        // Here you should define the logic to retrieve all reports from both contract and jobs tables
        // For example, you can query reports from both tables separately and combine the results

        return reportsList;
    }

    public ArrayList<String> getAllJobReports() {
        ArrayList<String> jobReportsList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();

        // Define the columns you want to retrieve
        String[] projection = {JobsCustomersContract.ReportsEntry.COLUMN_VISIT_PURPOSE};

        // Query the database to retrieve all job reports
        Cursor cursor = db.query(
                JobsCustomersContract.ReportsEntry.TABLE_NAME,  // The table to query
                projection,                     // The columns to return
                null,                           // The columns for the WHERE clause
                null,                           // The values for the WHERE clause
                null,                           // Don't group the rows
                null,                           // Don't filter by row groups
                null                            // The sort order
        );

        // Add job reports to the list
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String reportPurpose = cursor.getString(cursor.getColumnIndexOrThrow(JobsCustomersContract.ReportsEntry.COLUMN_VISIT_PURPOSE));
                jobReportsList.add(reportPurpose);
            }
            cursor.close(); // Close the cursor to release its resources
        }

        return jobReportsList;
    }

    public static class ContractCustomersContract {
        private ContractCustomersContract() {}

        public static class CustomerEntry implements BaseColumns {
            public static final String TABLE_NAME = "contract_customers";
            public static final String COLUMN_NAME = "name";
            public static final String COLUMN_ADDRESS = "address";
            public static final String COLUMN_PHONE = "phone";
            public static final String COLUMN_EMAIL = "email";
            public static final String COLUMN_COMPANY = "company";
            public static final String COLUMN_VISIT = "visit";
            public static final String COLUMN_PRICE_PER_QUARTER = "price_per_quarter";
        }

        public static class ReportsEntry implements BaseColumns {
            public static final String TABLE_NAME = "contract_customers_reports";
            public static final String COLUMN_CUSTOMER_ID = "customer_id";
            public static final String COLUMN_VISIT_PURPOSE = "visit_purpose";
            public static final String COLUMN_DATE = "date";
            public static final String COLUMN_FINDING = "finding";
            public static final String COLUMN_RECOMMENDATION = "recommendation";
            public static final String COLUMN_FOLLOW_UP = "follow_up";
            public static final String COLUMN_MATERIALS = "materials";
            public static final String COLUMN_SIGN = "sign";
        }
    }

    public static class JobsCustomersContract {
        private JobsCustomersContract() {}

        public static class CustomerEntry implements BaseColumns {
            public static final String TABLE_NAME = "jobs_customers";
            public static final String COLUMN_NAME = "name";
            public static final String COLUMN_ADDRESS = "address";
            public static final String COLUMN_PHONE = "phone";
            public static final String COLUMN_EMAIL = "email";
            public static final String COLUMN_VISIT_REASON = "visit_reason";
            public static final String COLUMN_PRICE = "price";
        }

        public static class ReportsEntry implements BaseColumns {
            public static final String TABLE_NAME = "jobs_customers_reports";
            public static final String COLUMN_CUSTOMER_NAME = "customer_name";
            public static final String COLUMN_VISIT_PURPOSE = "visit_purpose";
            public static final String COLUMN_DATE = "date";
            public static final String COLUMN_FINDING = "finding";
            public static final String COLUMN_RECOMMENDATION = "recommendation";
            public static final String COLUMN_FOLLOW_UP = "follow_up";
            public static final String COLUMN_MATERIALS = "materials";
            public static final String COLUMN_SIGN = "sign";
        }
    }
}
